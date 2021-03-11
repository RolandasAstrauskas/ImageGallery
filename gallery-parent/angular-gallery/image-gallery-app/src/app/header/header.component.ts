import { Component, Output, EventEmitter, OnChanges} from '@angular/core';
import { SimpleChanges } from '@angular/core';
import { ModelPhoto } from '../model-photo/model-photo.component';
import { HttpComponent } from '../http.component';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnChanges{

     photoName: any;
     selectedFile = null;
     inputData = '';
     data = '';

  constructor(private rs: HttpComponent) { }

   ngOnChanges(changes: SimpleChanges){
   console.log(changes);}



   @Output() event = new EventEmitter<string>()

      onFileSelected(event) {
         this.selectedFile = event.target.files[0];
             }

      onSubmit() {
              const payload = new FormData();
                    payload.append('photoName', this.photoName);
                    payload.append('image', this.selectedFile, this.selectedFile.name);
                            this.rs.saveImageItem(payload);
                    }

      getEventHandler(){
             this.data = this.inputData;
             this.event.emit(this.data);
      }

       onClickUpdate(event){
           this.inputData = event.target.value;
        }
}
