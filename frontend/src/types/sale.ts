import { Seller } from "./seller"

export type Sale = {
    id: number;
    amount: number;
    seller : Seller;
    visited : number;
    deals : number;
    date: string;
}

export type SalePage = {
    content?: Sale[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size?: number;
    number: number;
    first: boolean;
    numberOfElements?: number;
    empty?:boolean;    
}

export type SaleSum = {
    sellerName : string;
    sum : number;
}

export type SaleSuccess = {
    sellerName : string;
    visited : number;
    deals : number;
}
