package Company.Knoldus.Database

import Company.Knoldus.Models.Company

import scala.collection.immutable.HashMap

class CompanyData {

  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val OneplusCompany: Company = Company("Oneplus", "oneplus@gmail.com", "Chennai")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "Oneplus" -> OneplusCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}
