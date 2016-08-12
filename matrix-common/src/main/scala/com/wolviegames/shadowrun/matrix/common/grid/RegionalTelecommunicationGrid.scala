package com.wolviegames.shadowrun.matrix.common.grid

import java.util.UUID

/**
  * Regional Telecommunication Grid
  * Represents a grid that is part of a regular telecommunication in North America
  *
  * Yes, I know, UUID might be overkill, but I want to have this in FOR THE MYSTIQUE
  * Because seriously, we're used to seeing UUIDs with our daily jobs but could you see how standard roleplayers
  * WOULD FREAK when they're given a UUID from the storyteller or, perhaps from another part of a system or document?
  *
  * We can always use something else later, if we want to do even more obscure sounding places.
  *
  * Reference: Shadowrun 3rd edition pg. 203
  */
trait RegionalTelecommunicationGrid {

  def gridIdentifier: UUID
  def gridName: String
  def regionName: String
  def securityRating: String // TODO enumeration once we know more about the different levels.

  // TODO What follows could probably be extracted somewhere else, since I see it in some other matrix stuff as well
  // We can extract it once we see a definite pattern and know how we want to encapsulate it
  def accessRating: Int
  def controlRating: Int
  def indexRating: Int
  def filesRating: Int
  def slaveRating: Int

}
