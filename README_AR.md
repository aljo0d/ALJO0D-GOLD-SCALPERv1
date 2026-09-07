# ALJO0D GOLD SCALPER — v3 UI / Cloud Build

هذه نسخة واجهة مستقلة لمشروع ALJO0D GOLD SCALPER ولا تعتمد على PhoneX.

## الموجود حاليًا
- XAUUSD
- MT4 / MT5 selector
- Minimum / Custom Lot selector
- Max Trades: 1 / 2 / 3 / Custom
- SL / TP fields
- Spread protection display
- Daily loss protection display
- START / STOP UI
- RUNNING dashboard
- Floating Profit / Open Trades / Last Trade / BUY-SELL / SL-TP / Spread / Today P/L / Connection
- لا يوجد Martingale أو مضاعفة للوت.

## مهم
هذه النسخة UI/Prototype. زر START لا ينفذ صفقات حقيقية بعد. تنفيذ التداول سيضاف لاحقًا عبر Connector وAPI بعد بناء واختبار Trading Engine.

## بناء APK من الهاتف عبر GitHub Actions
1. أنشئ مستودعًا جديدًا على GitHub.
2. ارفع محتويات هذا المجلد إلى المستودع، بحيث يكون `.github/workflows/build-apk.yml` في مكانه الصحيح.
3. افتح تبويب **Actions**.
4. اختر **Build ALJO0D GOLD SCALPER APK**.
5. اضغط **Run workflow**.
6. بعد انتهاء البناء افتح نتيجة الـworkflow، وستجد Artifact باسم `ALJO0D-GOLD-SCALPER-v3-debug`.
7. نزّل الـArtifact وفك الضغط لتحصل على `app-debug.apk` ثم ثبته على هاتف Android.

## ملاحظة
الـAPK الناتج Debug للتجربة، وليس إصدارًا موقعًا للنشر على Google Play.
