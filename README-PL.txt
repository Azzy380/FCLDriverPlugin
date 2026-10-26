FCL TURNIP 710/720/722 V4.5 - PLIKI DO NADPISANIA W REPOZYTORIUM

UWAGA: to NIE jest gotowe APK. To nakladka na oryginalny projekt FCLDriverPlugin.
1. Pobierz kod https://github.com/FCL-Team/FCLDriverPlugin (Code -> Download ZIP).
2. Rozpakuj oryginalny projekt.
3. Skopiuj zawartosc tego ZIP do katalogu glownego oryginalnego projektu,
   scalajac foldery i zastępujac app/build.gradle.kts.
4. Otworz projekt w Android Studio i wykonaj Gradle assembleRelease.
   Alternatywnie wyslij zmieniony projekt do wlasnego repozytorium GitHub.
   W Actions uruchom workflow 'Build Turnip FCL Plugin' (Run workflow).
5. Zainstaluj powstale APK (dla lokalnej kompilacji: app/build/outputs/apk/release/).
6. W FCL: ustawienia wersji -> Driver -> Turnip 710 720 722 v4.5.

Sterownik: oryginalny libvulkan_freedreno.so z przeslanego ZIP.
Nazwa i identyfikator pakietu sa odrebne od oficjalnej wtyczki.
Wymagana wersja FCL rozpoznajaca driver_lib i driver_gpu.
