export class ModelPhoto
{
    public id:string;
    public photoName:string;
    public dateOfStorage:string;
    public image: any;

    constructor(id: string, photoName: string, dateOfStorage: string, image: any)
    {
        this.id = id;
        this.photoName = photoName;
        this.dateOfStorage = dateOfStorage;
        this.image = image;
    }
}
