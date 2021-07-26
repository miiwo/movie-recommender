import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms'

import { UserService } from '../shared/user.service'
import { User } from '../models/user'

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  form:FormGroup

  email:FormControl
  password:FormControl

  constructor(private us:UserService) { }

  ngOnInit(): void {
    this.createControl()
    this.createForm()
  }

  createControl() {
    this.email = new FormControl('', [Validators.required, Validators.email])
    this.password = new FormControl('', Validators.required)
  }

  createForm() {
    this.form = new FormGroup({
      email:this.email,
      password:this.password
    })
  }

  registerUser() {
    let user:User = {
      id: 3,
      email: this.form.value.email,
      password: this.form.value.password
    }
    this.us.registerUser(user).subscribe(data => {
      console.log('it worked')
    },
    error => {
      console.log('it didnt work')
    })
  }
}
