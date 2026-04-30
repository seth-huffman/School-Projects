<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html font-family="avenir">
    <body>
    <table border="1">
       <thead>
       <tr bgcolor="#3CBACB">
         <th> information </th>
         <th> name </th>
         <th> year </th>
         <th> price </th>
         <th> trim </th>
         <th> color </th>
         <th> type </th>
       </tr>
      </thead>
      <xsl:for-each select = "/car_compare/brands">

        <tr>
          <td><xsl:value-of select = "@id"/><br/><br/><br/></td>
          <td><xsl:value-of select = "name"/><br/><br/><br/></td>
          <td><xsl:value-of select = "year[1]"/><br/>
              <xsl:value-of select = "year[2]"/><br/>
              <xsl:value-of select = "year[3]"/></td>
          <td><xsl:value-of select = "price[1]"/><br/>
              <xsl:value-of select = "price[2]"/><br/>
              <xsl:value-of select = "price[3]"/></td>
          <td><xsl:value-of select = "trim[1]"/><br/>
              <xsl:value-of select = "trim[2]"/><br/>
              <xsl:value-of select = "trim[3]"/></td>
          <td><xsl:value-of select = "color[1]"/><br/>
            <xsl:value-of select = "color[2]"/><br/>
            <xsl:value-of select = "color[3]"/></td>
          <td><xsl:value-of select = "type"/><br/><br/><br/></td>
        </tr>
      </xsl:for-each>
    </table>
  </body>
</html>
</xsl:template>
</xsl:stylesheet>
