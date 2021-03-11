import { Component, OnInit } from '@angular/core';
import { GridImageComponent } from './grid-image/grid-image.component';
import { ModelPhoto } from './model-photo/model-photo.component';
import { HeaderComponent } from './header/header.component';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  data = "";

 constructor(){}

    ngOnInit(){
     }

     receiveData($event){this.data = $event
     }

}
