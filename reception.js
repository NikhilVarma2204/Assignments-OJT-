import React, { Component } from 'react'
import ReceptionService from '../../services/receptionService'
class Reception extends Component {
    state = { 
        guests: [],
     }
     componentDidMount=()=> {
          ReceptionService.getStaffDetails()
          .then(res =>{
            console.log(res.data)  
            this.setState({ guests: res.data})})
            console.log(...this.state.guests)
     }
    render() { 
        return (<>
        Reception:
       
                
        
         </> );
    }
}
 
export default Reception;