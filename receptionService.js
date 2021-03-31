/*
Services for Reception department will be provided here

*/
import axios from 'axios';

 class ReceptionService{
 
 
 // Get the whole Staff Database
getStaffDetails = ()=>{
   var get_staff_database = "http://localhost:8080/reception/show"
   return axios.get(get_staff_database)
   
}

}
export default new ReceptionService;
