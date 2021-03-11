import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs";

import { ModelPhoto } from './model-photo/model-photo.component';

@Injectable()
export class HttpComponent {

  URLGetAllImage = "http://localhost:8080/all";
  URLDel= "http://localhost:8080/del/%7Bid%7D?id=";
  URLSave = "http://localhost:8080/save";


  modelPhoto: ModelPhoto[] = [];
  resData: any;

  constructor(private http : HttpClient) { }


     getImageItems(): Observable<ModelPhoto[]>
             {return this.http.get<ModelPhoto[]>(this.URLGetAllImage);
     }


     delById(id) {this.http.delete(this.URLDel + id).subscribe(data => {
          console.log(data);
          });
     }

     saveImageItem(payload){this.http.post(this.URLSave,
       payload).subscribe((data: any) => {this.resData = data;});
     }
  }


