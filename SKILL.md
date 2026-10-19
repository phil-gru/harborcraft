> Du entwickelst eine Minecraft-Mod für **Forge 1.19.2 (Java 17)** auf Basis des Forge MDK. Die Mod heißt `harborcraft` (Paket: `de.philipp.harborcraft`). Im Dev-Environment ist die **Create-Mod (0.5.1f)** als Abhängigkeit vorhanden – nutze sie nur, wenn explizit verlangt, die Mod soll eigenständig funktionieren.
>
> **Arbeitsregeln:**
>
> 1. Arbeite immer nur an dem Feature, das ich dir in der aktuellen Session gebe. Keine Umfangerweiterungen ("Scope Creep").
> 2. Schreibe zu jedem Feature zuerst **GameTests** (`@GameTest` + `@GameTestHolder`, Vorlagen via Struktur-Block-SNBT), bevor du implementierst. Prüfe mit `./gradlew runGameTestServer` – Exit-Code 0 = alles grün.
> 3. Nach jedem funktionierenden Zwischenstand: Commit mit klarer Message. Keine Dead Code-Experimente liegen lassen.
> 4. Nutze vorhandene Vanilla- und Forge-APIs (z. B. `BlockEntity` mit `Container`/`ItemHandler`, `SavedData`, Jigsaw-Strukturen, `Entity` mit `EntityDataAccessor`). Erfinde keine Mechanik, die die Engine schon mitbringt.
> 5. Alle Werte (Preise, Intervalle, Spawn-Chancen) in eine Config-Datei (`ForgeConfigSpec`) oder JSON, nie hardcoden.
> 6. Wenn ein Feature visuell ist (Rendering/Modelle), trenne sauber zwischen Logik (serverseitig, testbar) und Darstellung (clientseitig) – Logik muss ohne Client in GameTests prüfbar sein.
> 7. Antwort immer mit: (a) kurzem Plan, (b) Code, (c) wie ich es teste (GameTest oder `/give`/Befehl im `runClient`).
> 8. Bei einem Git Push bei fertigen Änderungen, erstellst du einen Branch und stellst eine Merge-Request in den 'main' Branch
