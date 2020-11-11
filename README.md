
# Away Office 
## A Java Spring Boot based Restful Back End App of Away Office Project. 

### The APIs are architectured according to the modern Restful standards. 


[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/28663e80ab17cdc16844)


## The figure below shows the ERD mapping for the Project implemented in this API application.


![ERD_Diagram_AwayOffice](https://awayoffice.web.app/static/media/HomeAssetClassDiagram.71e805ce.png "ERD Away Office")


### The table below shows the currently avaiable REST-API end-points avaiable. 

### Backend App is live at : https://awayoffice.herokuapp.com


##### Each row shows a given API endpoint or URI, HTTP Verb and a brief description of the API.


<table>
  <tr>
   <td><strong>URI</strong>
   </td>
   <td><strong>App Package</strong>
   </td>
   <td><strong>HTTP Verb</strong>
   </td>
   <td><strong>Description</strong>
   </td>
   <td><strong>Author</strong>
   </td>
  </tr>
  <tr>
   <td>/api/inventory/assetmodel
   </td>
   <td>Inventory
   </td>
   <td>GET
   </td>
   <td>Retrieve all asset models
   </td>
   <td>Abdul
   </td>
  </tr>
  <tr>
   <td>/api/inventory/assetmodel/{id}
   </td>
   <td>Inventory
   </td>
   <td>GET
   </td>
   <td>Retrieve a specific asset model
   </td>
   <td>Abdul
   </td>
  </tr>
  <tr>
   <td>/api/inventory/assetmodel
   </td>
   <td>Inventory
   </td>
   <td>POST
   </td>
   <td>Create or register a new asset model
   </td>
   <td>Abdul
   </td>
  </tr>
  <tr>
   <td>/api/inventory/assetmodel
   </td>
   <td>Inventory
   </td>
   <td>PUT
   </td>
   <td>Update an existing asset model
   </td>
   <td>Abdul
   </td>
  </tr>
  <tr>
   <td>/api/inventory/assetmodel/{id}
   </td>
   <td>Inventory
   </td>
   <td>DELETE
   </td>
   <td>Delete an asset model based on its id
   </td>
   <td>Abdul
   </td>
  </tr>
  <tr>
   <td>/api/hr/employee/{id}
   </td>
   <td>HR
   </td>
   <td>GET
   </td>
   <td>Retrieve a specific employee
   </td>
   <td>Zubair
   </td>
  </tr>
  <tr>
   <td>/api/hr/employee
   </td>
   <td>HR
   </td>
   <td>GET
   </td>
   <td>Retrieve all employees
   </td>
   <td>Zubair
   </td>
  </tr>
  <tr>
   <td>/api/hr/employee
   </td>
   <td>HR
   </td>
   <td>POST
   </td>
   <td>Create or register a new employee
   </td>
   <td>Zubair
   </td>
  </tr>
  <tr>
   <td>/api/hr/employee
   </td>
   <td>HR
   </td>
   <td>PUT
   </td>
   <td>Update an existing employee
   </td>
   <td>Zubair
   </td>
  </tr>
  <tr>
   <td>/api/hr/employee/{id}
   </td>
   <td>HR
   </td>
   <td>DELETE
   </td>
   <td>Delete an employee based on the id
   </td>
   <td>Zubair
   </td>
  </tr>
  <tr>
   <td>/api/hr/vendors/{id}
   </td>
   <td>HR
   </td>
   <td>GET
   </td>
   <td>Retrieve a specific vendor based on the id
   </td>
   <td>Mirlind
   </td>
  </tr>
  <tr>
   <td>/api/hr/vendors
   </td>
   <td>HR
   </td>
   <td>GET
   </td>
   <td>Retrieve a list of vendors
   </td>
   <td>Mirlind
   </td>
  </tr>
  <tr>
   <td>/api/hr/vendors
   </td>
   <td>HR
   </td>
   <td>POST
   </td>
   <td>Create or register a new vendor
   </td>
   <td>Mirlind
   </td>
  </tr>
  <tr>
   <td>/api/hr/vendors
   </td>
   <td>HR
   </td>
   <td>PUT
   </td>
   <td>Update an existing vendor
   </td>
   <td>Mirlind
   </td>
  </tr>
  <tr>
   <td>/api/hr/vendors/{id}
   </td>
   <td>HR
   </td>
   <td>DELETE
   </td>
   <td>Delete a vendor based on the id
   </td>
   <td>Mirlind
   </td>
  </tr>
</table>


