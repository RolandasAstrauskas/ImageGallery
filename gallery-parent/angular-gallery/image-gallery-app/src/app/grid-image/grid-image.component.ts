import { Component, OnChanges, Input } from '@angular/core';
import { SimpleChanges } from '@angular/core';
import { Observable } from "rxjs";
import { ModelPhoto } from '../model-photo/model-photo.component';
import { AppComponent } from '../app.component';
import { MatGridListModule } from '@angular/material/grid-list';
import { NgModule } from '@angular/core';
import { FormBuilder, FormGroup } from "@angular/forms";
import { FormsModule } from '@angular/forms';
import { HttpComponent } from '../http.component';
import { AppRoutingModule } from '../app-routing.module';


@Component({
  selector: 'app-grid-image',
  templateUrl: './grid-image.component.html',
  styleUrls: ['./grid-image.component.css']
})
export class GridImageComponent implements OnChanges {


 modelPhotos: ModelPhoto[] = [];
 modelPhoto: ModelPhoto;
 columnNum = 3;

 @Input() data: any;

  constructor(private rs: HttpComponent) { }

ngOnChanges(changes: SimpleChanges) {
this.refresh();
  this.columnNum = (window.innerWidth <= 480) ? 1 : 3;
    console.log(changes)
}


   delById(id){
      this.rs.delById(id);
      this.refresh();
   }

   refresh() {
      this.rs.getImageItems().subscribe(
             (response) => {this.modelPhotos = response;}
            )
   }

   onResize(event) {
      if(event.target.innerWidth <= 480){
      this.columnNum = 1;
      }else if(event.target.innerWidth >= 480 && event.target.innerWidth <= 1060){
       this.columnNum = 2;
      }else if (event.target.innerWidth >= 1060){
       this.columnNum = 3;
      }
    }
  }
