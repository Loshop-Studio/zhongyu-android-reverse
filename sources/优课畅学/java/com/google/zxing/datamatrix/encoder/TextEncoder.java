package com.google.zxing.datamatrix.encoder;

/* loaded from: classes4.dex */
final class TextEncoder extends C40Encoder {
    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    public int encodeChar(char c10, StringBuilder sb) {
        if (c10 == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c10 >= '0' && c10 <= '9') {
            sb.append((char) (c10 - ','));
            return 1;
        }
        if (c10 >= 'a' && c10 <= 'z') {
            sb.append((char) (c10 - 'S'));
            return 1;
        }
        if (c10 < ' ') {
            sb.append((char) 0);
            sb.append(c10);
            return 2;
        }
        if (c10 >= '!' && c10 <= '/') {
            sb.append((char) 1);
            sb.append((char) (c10 - '!'));
            return 2;
        }
        if (c10 >= ':' && c10 <= '@') {
            sb.append((char) 1);
            sb.append((char) (c10 - '+'));
            return 2;
        }
        if (c10 >= '[' && c10 <= '_') {
            sb.append((char) 1);
            sb.append((char) (c10 - 'E'));
            return 2;
        }
        if (c10 == '`') {
            sb.append((char) 2);
            sb.append((char) (c10 - '`'));
            return 2;
        }
        if (c10 >= 'A' && c10 <= 'Z') {
            sb.append((char) 2);
            sb.append((char) (c10 - '@'));
            return 2;
        }
        if (c10 < '{' || c10 > 127) {
            sb.append("\u0001\u001e");
            return encodeChar((char) (c10 - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c10 - '`'));
        return 2;
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder, com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 2;
    }
}
