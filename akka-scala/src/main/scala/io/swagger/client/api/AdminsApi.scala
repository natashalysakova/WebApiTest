/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.InventoryItem
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object AdminsApi {

  /**
   * Adds an item to the system
   * 
   * Expected answers:
   *   code 201 :  (item created)
   *   code 400 :  (invalid input, object invalid)
   *   code 409 :  (an existing item already exists)
   * 
   * @param inventoryItem Inventory item to add
   */
  def addInventory(inventoryItem: Option[InventoryItem] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/natashalysakova/Test/1.0.0", "/inventory", "application/json")
      .withBody(inventoryItem)
      .withSuccessResponse[Unit](201)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](409)
      

}

