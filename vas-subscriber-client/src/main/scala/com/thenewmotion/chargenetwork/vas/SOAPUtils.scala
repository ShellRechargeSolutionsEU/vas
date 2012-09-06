package com.thenewmotion.chargenetwork.vas

object SOAPUtils {
  import scalaxb._
  import soapenvelope12._
  import scala.xml._


  def generateSoapResponse[A, B](respBody: A, respHead: B, bodyWrap: String, headWrap: String)
                                (implicit formatBody: XMLFormat[A], formatHead: XMLFormat[B]) = {
    val xmlns = "urn://Vas/Cs/2010/12/"
    val scope = NamespaceBinding("soap12", xmlns, soapenvelope12.defaultScope)

    val body = toXML(respBody, Some(xmlns), bodyWrap, scope)
    val head = toXML(respHead, Some(xmlns), headWrap, scope)
    val bodyRecords = body.toSeq map {
      DataRecord(None, None, _)
    }
    val headerOption = head.toSeq.headOption map {
      _ =>
        Header(head.toSeq map {
          DataRecord(None, None, _)
        }, Map())
    }
    val envelope = Envelope(headerOption, Body(bodyRecords, Map()), Map())

    toXML(envelope, Some(xmlns), "Envelope", scope)
  }
}
