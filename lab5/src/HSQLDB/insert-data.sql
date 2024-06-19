
-- Wstawianie danych
INSERT INTO Student (id_studenta, imie, nazwisko, data_urodzenia, pesel, nr_albumu) VALUES
(1, 'Jan', 'Kowalski', '2000-01-01', '12345678901', '20210001');

INSERT INTO Dane_Kontaktowe (id_dane_kontaktowe, nazwa_ulicy, nr_domu, nr_mieszkania, kod_pocztowy, miejscowosc, email, telefon, id_studenta) VALUES
(1, 'Mickiewicza', '10', '2', '50-001', 'Wrocław', 'jan.kowalski@example.com', '123456789', 1);

INSERT INTO Konto_Użytkownika (id_konto, id_uzytkownika, nazwa_uzytkownika, haslo, status_konta) VALUES
(1, 1, 'jkowalski', 'password123', 'Aktywne');

INSERT INTO Historia_Logowania (id_logowania, id_konto_użytkownika, data_logowania, wynik_logowania) VALUES
(1, 1, '2024-06-07 10:00:00', 'Sukces');

INSERT INTO Zajęcia (id_zajęć, dzień, godzina_rozpoczęcia, godzina_zakończenia, nr_sali, rodzaj_zajęć) VALUES
(1, 1, '08:00:00', '09:30:00', 'A101', 'Wykład');

INSERT INTO Przedmioty (id_przedmiotu, nazwa, opis) VALUES
(1, 'Matematyka', 'Podstawy matematyki wyższej');

INSERT INTO Wykładowca (id_wykładowcy, imie, nazwisko, tytul) VALUES
(1, 'Adam', 'Nowak', 'Dr');

INSERT INTO Książka (id_ksiazki, tytul, autor, isbn, id_kategorii, id_lokalizacji) VALUES
(1, 'Algorytmy i struktury danych', 'Robert Sedgewick', '9780134190440', 1, 1);

INSERT INTO Wypożyczenie (id_wypozyczenia, id_studenta, id_ksiazki, data_wypozyczenia, data_zwrotu) VALUES
(1, 1, 1, '2024-06-01 10:00:00', '2024-06-15 10:00:00');

INSERT INTO Status_Wypożyczenia (klucz, wartość) VALUES
('wypozyczona', 'Wypożyczona');

INSERT INTO Typ_adresu (klucz, wartość) VALUES
('zamieszkania', 'Adres zamieszkania');

INSERT INTO Status_studenta (klucz, wartość) VALUES
('aktywny', 'Aktywny student');

INSERT INTO Płatność (id_platnosci, id_konto, kwota, data_księgowania, data_platnosci) VALUES
(1, 1, 1000.00, '2024-06-01', '2024-06-01');

INSERT INTO Status_płatności (klucz, wartość) VALUES
('zaplacona', 'Płatność zapłacona');
