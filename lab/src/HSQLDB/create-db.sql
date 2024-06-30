-- Tworzenie tabel
CREATE TABLE Student (
    id_studenta INT PRIMARY KEY,
    imie VARCHAR(50),
    nazwisko VARCHAR(50),
    data_urodzenia DATE,
    pesel VARCHAR(11),
    nr_albumu VARCHAR(10)
);

CREATE TABLE Dane_Kontaktowe (
    id_dane_kontaktowe INT PRIMARY KEY,
    nazwa_ulicy VARCHAR(50),
    nr_domu VARCHAR(10),
    nr_mieszkania VARCHAR(10),
    kod_pocztowy VARCHAR(10),
    miejscowosc VARCHAR(50),
    email VARCHAR(50),
    telefon VARCHAR(20),
    id_studenta INT,
    FOREIGN KEY (id_studenta) REFERENCES Student(id_studenta)
);

CREATE TABLE Konto_Użytkownika (
    id_konto INT PRIMARY KEY,
    id_uzytkownika INT,
    nazwa_uzytkownika VARCHAR(50),
    haslo VARCHAR(50),
    status_konta VARCHAR(20)
);

CREATE TABLE Historia_Logowania (
    id_logowania INT PRIMARY KEY,
    id_konto_użytkownika INT,
    data_logowania TIMESTAMP,
    wynik_logowania VARCHAR(20),
    FOREIGN KEY (id_konto_użytkownika) REFERENCES Konto_Użytkownika(id_konto)
);

CREATE TABLE Zajęcia (
    id_zajęć INT PRIMARY KEY,
    dzień INT,
    godzina_rozpoczęcia TIME,
    godzina_zakończenia TIME,
    nr_sali VARCHAR(10),
    rodzaj_zajęć VARCHAR(20)
);

CREATE TABLE Przedmioty (
    id_przedmiotu INT PRIMARY KEY,
    nazwa VARCHAR(50),
    opis VARCHAR(255)
);

CREATE TABLE Wykładowca (
    id_wykładowcy INT PRIMARY KEY,
    imie VARCHAR(50),
    nazwisko VARCHAR(50),
    tytul VARCHAR(20)
);

CREATE TABLE Książka (
    id_ksiazki INT PRIMARY KEY,
    tytul VARCHAR(100),
    autor VARCHAR(50),
    isbn VARCHAR(20),
    id_kategorii INT,
    id_lokalizacji INT
);

CREATE TABLE Wypożyczenie (
    id_wypozyczenia INT PRIMARY KEY,
    id_studenta INT,
    id_ksiazki INT,
    data_wypozyczenia TIMESTAMP,
    data_zwrotu TIMESTAMP,
    FOREIGN KEY (id_studenta) REFERENCES Student(id_studenta),
    FOREIGN KEY (id_ksiazki) REFERENCES Książka(id_ksiazki)
);

CREATE TABLE Status_Wypożyczenia (
    klucz VARCHAR(20) PRIMARY KEY,
    wartość VARCHAR(50)
);

CREATE TABLE Typ_adresu (
    klucz VARCHAR(20) PRIMARY KEY,
    wartość VARCHAR(50)
);

CREATE TABLE Status_studenta (
    klucz VARCHAR(20) PRIMARY KEY,
    wartość VARCHAR(50)
);

CREATE TABLE Płatność (
    id_platnosci INT PRIMARY KEY,
    id_konto INT,
    kwota DECIMAL(10, 2),
    data_księgowania DATE,
    data_platnosci DATE,
    FOREIGN KEY (id_konto) REFERENCES Konto_Użytkownika(id_konto)
);

CREATE TABLE Status_płatności (
    klucz VARCHAR(20) PRIMARY KEY,
    wartość VARCHAR(50)
);

