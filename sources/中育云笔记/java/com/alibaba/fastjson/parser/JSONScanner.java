package com.alibaba.fastjson.parser;

import androidx.camera.video.AudioStats;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.util.ASMUtils;
import com.alibaba.fastjson.util.IOUtils;
import com.blankj.utilcode.constant.TimeConstants;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

/* loaded from: classes3.dex */
public final class JSONScanner extends JSONLexerBase {
    private final int len;
    private final String text;

    public JSONScanner(String str) {
        this(str, JSON.DEFAULT_PARSER_FEATURE);
    }

    public static boolean charArrayCompare(String str, int i10, char[] cArr) {
        int length = cArr.length;
        if (length + i10 > str.length()) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (cArr[i11] != str.charAt(i10 + i11)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDate(char c10, char c11, char c12, char c13, char c14, char c15, int i10, int i11) {
        if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
            if (c14 == '0') {
                if (c15 < '1' || c15 > '9') {
                    return false;
                }
            } else if (c14 != '1' || (c15 != '0' && c15 != '1' && c15 != '2')) {
                return false;
            }
            if (i10 == 48) {
                return i11 >= 49 && i11 <= 57;
            }
            if (i10 != 49 && i10 != 50) {
                return i10 == 51 && (i11 == 48 || i11 == 49);
            }
            if (i11 >= 48 && i11 <= 57) {
                return true;
            }
        }
        return false;
    }

    private boolean checkTime(char c10, char c11, char c12, char c13, char c14, char c15) {
        if (c10 == '0') {
            if (c11 < '0' || c11 > '9') {
                return false;
            }
        } else {
            if (c10 != '1') {
                if (c10 == '2' && c11 >= '0' && c11 <= '4') {
                }
                return false;
            }
            if (c11 < '0' || c11 > '9') {
                return false;
            }
        }
        if (c12 < '0' || c12 > '5') {
            if (c12 != '6' || c13 != '0') {
                return false;
            }
        } else if (c13 < '0' || c13 > '9') {
            return false;
        }
        return (c14 < '0' || c14 > '5') ? c14 == '6' && c15 == '0' : c15 >= '0' && c15 <= '9';
    }

    private void setCalendar(char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        this.calendar = calendar;
        calendar.set(1, ((c10 - '0') * 1000) + ((c11 - '0') * 100) + ((c12 - '0') * 10) + (c13 - '0'));
        this.calendar.set(2, (((c14 - '0') * 10) + (c15 - '0')) - 1);
        this.calendar.set(5, ((c16 - '0') * 10) + (c17 - '0'));
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final String addSymbol(int i10, int i11, int i12, SymbolTable symbolTable) {
        return symbolTable.addSymbol(this.text, i10, i11, i12);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final void arrayCopy(int i10, char[] cArr, int i11, int i12) {
        this.text.getChars(i10, i12 + i10, cArr, i11);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public byte[] bytesValue() {
        if (this.token != 26) {
            return !this.hasSpecial ? IOUtils.decodeBase64(this.text, this.f3985np + 1, this.f3986sp) : IOUtils.decodeBase64(new String(this.sbuf, 0, this.f3986sp));
        }
        int i10 = this.f3985np + 1;
        int i11 = this.f3986sp;
        if (i11 % 2 != 0) {
            throw new JSONException("illegal state. " + i11);
        }
        int i12 = i11 / 2;
        byte[] bArr = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i13 * 2) + i10;
            char cCharAt = this.text.charAt(i14);
            char cCharAt2 = this.text.charAt(i14 + 1);
            char c10 = '7';
            int i15 = cCharAt - (cCharAt <= '9' ? '0' : '7');
            if (cCharAt2 <= '9') {
                c10 = '0';
            }
            bArr[i13] = (byte) ((i15 << 4) | (cCharAt2 - c10));
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final char charAt(int i10) {
        return i10 >= this.len ? JSONLexer.EOI : this.text.charAt(i10);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final void copyTo(int i10, int i11, char[] cArr) {
        this.text.getChars(i10, i11 + i10, cArr, 0);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final BigDecimal decimalValue() {
        char cCharAt = charAt((this.f3985np + this.f3986sp) - 1);
        int i10 = this.f3986sp;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i10--;
        }
        if (i10 > 65535) {
            throw new JSONException("decimal overflow");
        }
        int i11 = this.f3985np;
        char[] cArr = this.sbuf;
        if (i10 < cArr.length) {
            this.text.getChars(i11, i11 + i10, cArr, 0);
            return new BigDecimal(this.sbuf, 0, i10, MathContext.UNLIMITED);
        }
        char[] cArr2 = new char[i10];
        this.text.getChars(i11, i11 + i10, cArr2, 0);
        return new BigDecimal(cArr2, 0, i10, MathContext.UNLIMITED);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final int indexOf(char c10, int i10) {
        return this.text.indexOf(c10, i10);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public String info() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 1;
        int i11 = 1;
        int i12 = 0;
        while (i12 < this.f3983bp) {
            if (this.text.charAt(i12) == '\n') {
                i10++;
                i11 = 1;
            }
            i12++;
            i11++;
        }
        sb2.append("pos ");
        sb2.append(this.f3983bp);
        sb2.append(", line ");
        sb2.append(i10);
        sb2.append(", column ");
        sb2.append(i11);
        if (this.text.length() < 65535) {
            sb2.append(this.text);
        } else {
            sb2.append(this.text.substring(0, 65535));
        }
        return sb2.toString();
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public boolean isEOF() {
        int i10 = this.f3983bp;
        int i11 = this.len;
        return i10 == i11 || (this.f3984ch == 26 && i10 + 1 >= i11);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public boolean matchField2(char[] cArr) {
        while (JSONLexerBase.isWhitespace(this.f3984ch)) {
            next();
        }
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return false;
        }
        int length = this.f3983bp + cArr.length;
        int i10 = length + 1;
        char cCharAt = this.text.charAt(length);
        while (JSONLexerBase.isWhitespace(cCharAt)) {
            cCharAt = this.text.charAt(i10);
            i10++;
        }
        if (cCharAt != ':') {
            this.matchStat = -2;
            return false;
        }
        this.f3983bp = i10;
        this.f3984ch = charAt(i10);
        return true;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final char next() {
        int i10 = this.f3983bp + 1;
        this.f3983bp = i10;
        char cCharAt = i10 >= this.len ? JSONLexer.EOI : this.text.charAt(i10);
        this.f3984ch = cCharAt;
        return cCharAt;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final String numberString() {
        char cCharAt = charAt((this.f3985np + this.f3986sp) - 1);
        int i10 = this.f3986sp;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i10--;
        }
        return subString(this.f3985np, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Date scanDate(char r21) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONScanner.scanDate(char):java.util.Date");
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public double scanDouble(char c10) throws NumberFormatException {
        int i10;
        char cCharAt;
        boolean z10;
        boolean z11;
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        double d10;
        int i14;
        char cCharAt2;
        this.matchStat = 0;
        int i15 = this.f3983bp;
        int i16 = i15 + 1;
        char cCharAt3 = charAt(i15);
        boolean z12 = cCharAt3 == '\"';
        if (z12) {
            cCharAt3 = charAt(i16);
            i16 = i15 + 2;
        }
        boolean z13 = cCharAt3 == '-';
        if (z13) {
            cCharAt3 = charAt(i16);
            i16++;
        }
        if (cCharAt3 < '0' || cCharAt3 > '9') {
            boolean z14 = z12;
            if (cCharAt3 == 'n') {
                int i17 = i16 + 1;
                if (charAt(i16) == 'u') {
                    int i18 = i16 + 2;
                    if (charAt(i17) == 'l') {
                        int i19 = i16 + 3;
                        if (charAt(i18) == 'l') {
                            this.matchStat = 5;
                            int i20 = i16 + 4;
                            char cCharAt4 = charAt(i19);
                            if (z14 && cCharAt4 == '\"') {
                                cCharAt4 = charAt(i20);
                                i20 = i16 + 5;
                            }
                            while (cCharAt4 != ',') {
                                if (cCharAt4 == ']') {
                                    this.f3983bp = i20;
                                    this.f3984ch = charAt(i20);
                                    this.matchStat = 5;
                                    this.token = 15;
                                    return AudioStats.AUDIO_AMPLITUDE_NONE;
                                }
                                if (!JSONLexerBase.isWhitespace(cCharAt4)) {
                                    this.matchStat = -1;
                                    return AudioStats.AUDIO_AMPLITUDE_NONE;
                                }
                                int i21 = i20 + 1;
                                char cCharAt5 = charAt(i20);
                                i20 = i21;
                                cCharAt4 = cCharAt5;
                            }
                            this.f3983bp = i20;
                            this.f3984ch = charAt(i20);
                            this.matchStat = 5;
                            this.token = 16;
                            return AudioStats.AUDIO_AMPLITUDE_NONE;
                        }
                    }
                }
            }
            this.matchStat = -1;
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        long j12 = cCharAt3 - '0';
        while (true) {
            i10 = i16 + 1;
            cCharAt = charAt(i16);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j12 = (j12 * 10) + (cCharAt - '0');
            i16 = i10;
        }
        if (cCharAt == '.') {
            int i22 = i16 + 2;
            char cCharAt6 = charAt(i10);
            if (cCharAt6 < '0' || cCharAt6 > '9') {
                this.matchStat = -1;
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            boolean z15 = true;
            long j13 = (j12 * 10) + (cCharAt6 - '0');
            long j14 = 10;
            while (true) {
                i14 = i22 + 1;
                cCharAt2 = charAt(i22);
                if (cCharAt2 < '0' || cCharAt2 > '9') {
                    break;
                }
                j13 = (j13 * 10) + (cCharAt2 - '0');
                j14 *= 10;
                i22 = i14;
                z15 = z15;
            }
            long j15 = j14;
            i10 = i14;
            cCharAt = cCharAt2;
            z10 = z15;
            z11 = z12;
            j10 = j13;
            j11 = j15;
        } else {
            z10 = true;
            z11 = z12;
            j10 = j12;
            j11 = 1;
        }
        boolean z16 = (cCharAt == 'e' || cCharAt == 'E') ? z10 : false;
        if (z16) {
            int i23 = i10 + 1;
            char cCharAt7 = charAt(i10);
            if (cCharAt7 == '+' || cCharAt7 == '-') {
                i10 += 2;
                cCharAt = charAt(i23);
            } else {
                i10 = i23;
                cCharAt = cCharAt7;
            }
            while (cCharAt >= '0' && cCharAt <= '9') {
                char cCharAt8 = charAt(i10);
                i10++;
                cCharAt = cCharAt8;
            }
        }
        if (!z11) {
            i11 = this.f3983bp;
            int i24 = i10;
            i12 = (i10 - i11) - 1;
            i13 = i24;
        } else {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            int i25 = i10 + 1;
            char cCharAt9 = charAt(i10);
            i11 = this.f3983bp + 1;
            i12 = (i25 - i11) - 2;
            i13 = i25;
            cCharAt = cCharAt9;
        }
        if (z16 || i12 >= 18) {
            d10 = Double.parseDouble(subString(i11, i12));
        } else {
            d10 = j10 / j11;
            if (z13) {
                d10 = -d10;
            }
        }
        if (cCharAt != c10) {
            this.matchStat = -1;
            return d10;
        }
        this.f3983bp = i13;
        this.f3984ch = charAt(i13);
        this.matchStat = 3;
        this.token = 16;
        return d10;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0104  */
    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean scanFieldBoolean(char[] r12) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONScanner.scanFieldBoolean(char[]):boolean");
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public Date scanFieldDate(char[] cArr) {
        Date date;
        char cCharAt;
        long j10;
        Date date2;
        char cCharAt2;
        boolean z10 = false;
        this.matchStat = 0;
        int i10 = this.f3983bp;
        char c10 = this.f3984ch;
        Date date3 = null;
        if (!charArrayCompare(this.text, i10, cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = this.f3983bp + cArr.length;
        int i11 = length + 1;
        char cCharAt3 = charAt(length);
        boolean z11 = true;
        if (cCharAt3 == '\"') {
            int iIndexOf = indexOf('\"', i11);
            if (iIndexOf == -1) {
                throw new JSONException("unclosed str");
            }
            this.f3983bp = i11;
            if (!scanISO8601DateIfMatch(false, iIndexOf - i11)) {
                this.f3983bp = i10;
                this.matchStat = -1;
                return null;
            }
            date2 = this.calendar.getTime();
            cCharAt2 = charAt(iIndexOf + 1);
            this.f3983bp = i10;
            while (cCharAt2 != ',' && cCharAt2 != '}') {
                if (!JSONLexerBase.isWhitespace(cCharAt2)) {
                    this.matchStat = -1;
                    return null;
                }
                int i12 = iIndexOf + 1;
                char cCharAt4 = charAt(iIndexOf + 2);
                iIndexOf = i12;
                cCharAt2 = cCharAt4;
            }
            this.f3983bp = iIndexOf + 1;
            this.f3984ch = cCharAt2;
            date = null;
        } else {
            char c11 = '9';
            if (cCharAt3 != '-' && (cCharAt3 < '0' || cCharAt3 > '9')) {
                this.matchStat = -1;
                return null;
            }
            if (cCharAt3 == '-') {
                cCharAt3 = charAt(i11);
                i11 = length + 2;
                z10 = true;
            }
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                date = null;
                cCharAt = cCharAt3;
                j10 = 0;
            } else {
                j10 = cCharAt3 - '0';
                while (true) {
                    int i13 = i11 + 1;
                    date = date3;
                    cCharAt = charAt(i11);
                    if (cCharAt < '0' || cCharAt > c11) {
                        break;
                    }
                    j10 = (j10 * 10) + (cCharAt - '0');
                    z11 = z11;
                    i11 = i13;
                    date3 = date;
                    c11 = '9';
                }
                if (cCharAt == ',' || cCharAt == '}') {
                    this.f3983bp = i11;
                }
            }
            if (j10 < 0) {
                this.matchStat = -1;
                return date;
            }
            if (z10) {
                j10 = -j10;
            }
            date2 = new Date(j10);
            cCharAt2 = cCharAt;
        }
        if (cCharAt2 == ',') {
            int i14 = this.f3983bp + 1;
            this.f3983bp = i14;
            this.f3984ch = charAt(i14);
            this.matchStat = 3;
            this.token = 16;
            return date2;
        }
        int i15 = this.f3983bp + 1;
        this.f3983bp = i15;
        char cCharAt5 = charAt(i15);
        if (cCharAt5 == ',') {
            this.token = 16;
            int i16 = this.f3983bp + 1;
            this.f3983bp = i16;
            this.f3984ch = charAt(i16);
        } else if (cCharAt5 == ']') {
            this.token = 15;
            int i17 = this.f3983bp + 1;
            this.f3983bp = i17;
            this.f3984ch = charAt(i17);
        } else if (cCharAt5 == '}') {
            this.token = 13;
            int i18 = this.f3983bp + 1;
            this.f3983bp = i18;
            this.f3984ch = charAt(i18);
        } else {
            if (cCharAt5 != 26) {
                this.f3983bp = i10;
                this.f3984ch = c10;
                this.matchStat = -1;
                return date;
            }
            this.token = 20;
        }
        this.matchStat = 4;
        return date2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (r12 != '.') goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        r14.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r4 >= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        r14.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if (r7 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (r12 == '\"') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        r14.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0074, code lost:
    
        r15 = r15 + 2;
        r12 = charAt(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007a, code lost:
    
        r11 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007f, code lost:
    
        if (r12 == ',') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        if (r12 != '}') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
    
        if (com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r12) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008a, code lost:
    
        r15 = r11 + 1;
        r12 = charAt(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0091, code lost:
    
        r14.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0094, code lost:
    
        r14.f3983bp = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009a, code lost:
    
        if (r12 != ',') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009c, code lost:
    
        r14.f3983bp = r11;
        r14.f3984ch = charAt(r11);
        r14.matchStat = 3;
        r14.token = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a9, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ac, code lost:
    
        return -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ad, code lost:
    
        if (r12 != '}') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00af, code lost:
    
        r14.f3983bp = r11;
        r8 = charAt(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b5, code lost:
    
        if (r8 != ',') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b7, code lost:
    
        r14.token = 16;
        r15 = r14.f3983bp + 1;
        r14.f3983bp = r15;
        r14.f3984ch = charAt(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c7, code lost:
    
        if (r8 != ']') goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c9, code lost:
    
        r14.token = 15;
        r15 = r14.f3983bp + 1;
        r14.f3983bp = r15;
        r14.f3984ch = charAt(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d9, code lost:
    
        if (r8 != '}') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00db, code lost:
    
        r14.token = 13;
        r15 = r14.f3983bp + 1;
        r14.f3983bp = r15;
        r14.f3984ch = charAt(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ed, code lost:
    
        if (r8 != 26) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ef, code lost:
    
        r14.token = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f3, code lost:
    
        r14.matchStat = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fb, code lost:
    
        if (com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r8) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fd, code lost:
    
        r8 = r14.f3983bp + 1;
        r14.f3983bp = r8;
        r8 = charAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        r14.f3983bp = r1;
        r14.f3984ch = r2;
        r14.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010d, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010e, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0111, code lost:
    
        return -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0112, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x007a, code lost:
    
        r11 = r15;
     */
    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int scanFieldInt(char[] r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONScanner.scanFieldInt(char[]):int");
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public long scanFieldLong(char[] cArr) {
        int i10;
        long j10;
        char cCharAt;
        boolean z10 = false;
        this.matchStat = 0;
        int i11 = this.f3983bp;
        char c10 = this.f3984ch;
        long j11 = 0;
        if (!charArrayCompare(this.text, i11, cArr)) {
            this.matchStat = -2;
            return 0L;
        }
        int length = this.f3983bp + cArr.length;
        int i12 = length + 1;
        char cCharAt2 = charAt(length);
        boolean z11 = cCharAt2 == '\"';
        if (z11) {
            cCharAt2 = charAt(i12);
            i12 = length + 2;
        }
        if (cCharAt2 == '-') {
            cCharAt2 = charAt(i12);
            i12++;
            z10 = true;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.f3983bp = i11;
            this.f3984ch = c10;
            this.matchStat = -1;
            return 0L;
        }
        long j12 = cCharAt2 - '0';
        while (true) {
            i10 = i12 + 1;
            j10 = j11;
            cCharAt = charAt(i12);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j12 = (j12 * 10) + (cCharAt - '0');
            i12 = i10;
            j11 = j10;
        }
        if (cCharAt == '.') {
            this.matchStat = -1;
            return j10;
        }
        if (z11) {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return j10;
            }
            cCharAt = charAt(i10);
            i10 = i12 + 2;
        }
        if (cCharAt == ',' || cCharAt == '}') {
            this.f3983bp = i10 - 1;
        }
        if (j12 < j10 && (j12 != Long.MIN_VALUE || !z10)) {
            this.f3983bp = i11;
            this.f3984ch = c10;
            this.matchStat = -1;
            return j10;
        }
        while (true) {
            if (cCharAt == ',') {
                int i13 = this.f3983bp + 1;
                this.f3983bp = i13;
                this.f3984ch = charAt(i13);
                this.matchStat = 3;
                this.token = 16;
                if (z10) {
                    return -j12;
                }
            } else if (cCharAt == '}') {
                int i14 = this.f3983bp + 1;
                this.f3983bp = i14;
                char cCharAt3 = charAt(i14);
                while (true) {
                    if (cCharAt3 == ',') {
                        this.token = 16;
                        int i15 = this.f3983bp + 1;
                        this.f3983bp = i15;
                        this.f3984ch = charAt(i15);
                        break;
                    }
                    if (cCharAt3 == ']') {
                        this.token = 15;
                        int i16 = this.f3983bp + 1;
                        this.f3983bp = i16;
                        this.f3984ch = charAt(i16);
                        break;
                    }
                    if (cCharAt3 == '}') {
                        this.token = 13;
                        int i17 = this.f3983bp + 1;
                        this.f3983bp = i17;
                        this.f3984ch = charAt(i17);
                        break;
                    }
                    if (cCharAt3 == 26) {
                        this.token = 20;
                        break;
                    }
                    if (!JSONLexerBase.isWhitespace(cCharAt3)) {
                        this.f3983bp = i11;
                        this.f3984ch = c10;
                        this.matchStat = -1;
                        return j10;
                    }
                    int i18 = this.f3983bp + 1;
                    this.f3983bp = i18;
                    cCharAt3 = charAt(i18);
                }
                this.matchStat = 4;
                if (z10) {
                    return -j12;
                }
            } else {
                if (!JSONLexerBase.isWhitespace(cCharAt)) {
                    this.matchStat = -1;
                    return j10;
                }
                this.f3983bp = i10;
                char cCharAt4 = charAt(i10);
                i10++;
                cCharAt = cCharAt4;
            }
        }
        return j12;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public String scanFieldString(char[] cArr) {
        this.matchStat = 0;
        int i10 = this.f3983bp;
        char c10 = this.f3984ch;
        while (!charArrayCompare(this.text, this.f3983bp, cArr)) {
            if (!JSONLexerBase.isWhitespace(this.f3984ch)) {
                this.matchStat = -2;
                return stringDefaultValue();
            }
            next();
            while (JSONLexerBase.isWhitespace(this.f3984ch)) {
                next();
            }
        }
        int length = this.f3983bp + cArr.length;
        int i11 = length + 1;
        char cCharAt = charAt(length);
        int i12 = 0;
        if (cCharAt != '\"') {
            while (JSONLexerBase.isWhitespace(cCharAt)) {
                i12++;
                int i13 = i11 + 1;
                char cCharAt2 = charAt(i11);
                i11 = i13;
                cCharAt = cCharAt2;
            }
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return stringDefaultValue();
            }
        }
        int iIndexOf = indexOf('\"', i11);
        if (iIndexOf == -1) {
            throw new JSONException("unclosed str");
        }
        String strSubString = subString(i11, iIndexOf - i11);
        if (strSubString.indexOf(92) != -1) {
            while (true) {
                int i14 = 0;
                for (int i15 = iIndexOf - 1; i15 >= 0 && charAt(i15) == '\\'; i15--) {
                    i14++;
                }
                if (i14 % 2 == 0) {
                    break;
                }
                iIndexOf = indexOf('\"', iIndexOf + 1);
            }
            int i16 = this.f3983bp;
            int length2 = iIndexOf - (((cArr.length + i16) + 1) + i12);
            strSubString = JSONLexerBase.readString(sub_chars(i16 + cArr.length + 1 + i12, length2), length2);
        }
        if ((this.features & Feature.TrimStringFieldValue.mask) != 0) {
            strSubString = strSubString.trim();
        }
        char cCharAt3 = charAt(iIndexOf + 1);
        while (cCharAt3 != ',' && cCharAt3 != '}') {
            if (!JSONLexerBase.isWhitespace(cCharAt3)) {
                this.matchStat = -1;
                return stringDefaultValue();
            }
            char cCharAt4 = charAt(iIndexOf + 2);
            iIndexOf++;
            cCharAt3 = cCharAt4;
        }
        this.f3983bp = iIndexOf + 1;
        this.f3984ch = cCharAt3;
        if (cCharAt3 == ',') {
            int i17 = iIndexOf + 2;
            this.f3983bp = i17;
            this.f3984ch = charAt(i17);
            this.matchStat = 3;
            return strSubString;
        }
        int i18 = iIndexOf + 2;
        this.f3983bp = i18;
        char cCharAt5 = charAt(i18);
        if (cCharAt5 == ',') {
            this.token = 16;
            int i19 = this.f3983bp + 1;
            this.f3983bp = i19;
            this.f3984ch = charAt(i19);
        } else if (cCharAt5 == ']') {
            this.token = 15;
            int i20 = this.f3983bp + 1;
            this.f3983bp = i20;
            this.f3984ch = charAt(i20);
        } else if (cCharAt5 == '}') {
            this.token = 13;
            int i21 = this.f3983bp + 1;
            this.f3983bp = i21;
            this.f3984ch = charAt(i21);
        } else {
            if (cCharAt5 != 26) {
                this.f3983bp = i10;
                this.f3984ch = c10;
                this.matchStat = -1;
                return stringDefaultValue();
            }
            this.token = 20;
        }
        this.matchStat = 4;
        return strSubString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00df, code lost:
    
        if (r9 != ']') goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e5, code lost:
    
        if (r3.size() != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e7, code lost:
    
        r2 = charAt(r1);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f3, code lost:
    
        r18.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        return null;
     */
    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection<java.lang.String> scanFieldStringArray(char[] r19, java.lang.Class<?> r20) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONScanner.scanFieldStringArray(char[], java.lang.Class):java.util.Collection");
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public long scanFieldSymbol(char[] cArr) {
        this.matchStat = 0;
        while (!charArrayCompare(this.text, this.f3983bp, cArr)) {
            if (!JSONLexerBase.isWhitespace(this.f3984ch)) {
                this.matchStat = -2;
                return 0L;
            }
            next();
            while (JSONLexerBase.isWhitespace(this.f3984ch)) {
                next();
            }
        }
        int length = this.f3983bp + cArr.length;
        int i10 = length + 1;
        char cCharAt = charAt(length);
        if (cCharAt != '\"') {
            while (JSONLexerBase.isWhitespace(cCharAt)) {
                cCharAt = charAt(i10);
                i10++;
            }
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return 0L;
            }
        }
        long j10 = -3750763034362895579L;
        while (true) {
            int i11 = i10 + 1;
            char cCharAt2 = charAt(i10);
            if (cCharAt2 == '\"') {
                this.f3983bp = i11;
                char cCharAt3 = charAt(i11);
                this.f3984ch = cCharAt3;
                while (cCharAt3 != ',') {
                    if (cCharAt3 == '}') {
                        next();
                        skipWhitespace();
                        char current = getCurrent();
                        if (current == ',') {
                            this.token = 16;
                            int i12 = this.f3983bp + 1;
                            this.f3983bp = i12;
                            this.f3984ch = charAt(i12);
                        } else if (current == ']') {
                            this.token = 15;
                            int i13 = this.f3983bp + 1;
                            this.f3983bp = i13;
                            this.f3984ch = charAt(i13);
                        } else if (current == '}') {
                            this.token = 13;
                            int i14 = this.f3983bp + 1;
                            this.f3983bp = i14;
                            this.f3984ch = charAt(i14);
                        } else {
                            if (current != 26) {
                                this.matchStat = -1;
                                return 0L;
                            }
                            this.token = 20;
                        }
                        this.matchStat = 4;
                        return j10;
                    }
                    if (!JSONLexerBase.isWhitespace(cCharAt3)) {
                        this.matchStat = -1;
                        return 0L;
                    }
                    int i15 = this.f3983bp + 1;
                    this.f3983bp = i15;
                    cCharAt3 = charAt(i15);
                }
                int i16 = this.f3983bp + 1;
                this.f3983bp = i16;
                this.f3984ch = charAt(i16);
                this.matchStat = 3;
                return j10;
            }
            if (i11 > this.len) {
                this.matchStat = -1;
                return 0L;
            }
            j10 = (j10 ^ cCharAt2) * 1099511628211L;
            i10 = i11;
        }
    }

    public boolean scanISO8601DateIfMatch() {
        return scanISO8601DateIfMatch(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r13 != '.') goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        r16.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (r7 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        if (r13 == '\"') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        r16.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        r13 = charAt(r12);
        r12 = r3 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        if (r4 >= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        r16.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r13 != r17) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        r16.f3983bp = r12;
        r16.f3984ch = charAt(r12);
        r16.matchStat = 3;
        r16.token = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a7, code lost:
    
        if (r6 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00aa, code lost:
    
        return -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
    
        if (com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r13) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        r13 = charAt(r12);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
    
        r16.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
    
        if (r6 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00be, code lost:
    
        return -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        return r4;
     */
    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int scanInt(char r17) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONScanner.scanInt(char):int");
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public long scanLong(char c10) {
        int i10;
        char cCharAt;
        this.matchStat = 0;
        int i11 = this.f3983bp;
        int i12 = i11 + 1;
        char cCharAt2 = charAt(i11);
        boolean z10 = cCharAt2 == '\"';
        if (z10) {
            cCharAt2 = charAt(i12);
            i12 = i11 + 2;
        }
        boolean z11 = cCharAt2 == '-';
        if (z11) {
            cCharAt2 = charAt(i12);
            i12++;
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            long j10 = cCharAt2 - '0';
            while (true) {
                i10 = i12 + 1;
                cCharAt = charAt(i12);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                j10 = (j10 * 10) + (cCharAt - '0');
                i12 = i10;
            }
            if (cCharAt == '.') {
                this.matchStat = -1;
                return 0L;
            }
            if (z10) {
                if (cCharAt != '\"') {
                    this.matchStat = -1;
                    return 0L;
                }
                cCharAt = charAt(i10);
                i10 = i12 + 2;
            }
            if (j10 < 0 && (j10 != Long.MIN_VALUE || !z11)) {
                this.matchStat = -1;
                return 0L;
            }
            while (cCharAt != c10) {
                if (!JSONLexerBase.isWhitespace(cCharAt)) {
                    this.matchStat = -1;
                    return j10;
                }
                cCharAt = charAt(i10);
                i10++;
            }
            this.f3983bp = i10;
            this.f3984ch = charAt(i10);
            this.matchStat = 3;
            this.token = 16;
            return z11 ? -j10 : j10;
        }
        if (cCharAt2 == 'n') {
            int i13 = i12 + 1;
            if (charAt(i12) == 'u') {
                int i14 = i12 + 2;
                if (charAt(i13) == 'l') {
                    int i15 = i12 + 3;
                    if (charAt(i14) == 'l') {
                        this.matchStat = 5;
                        int i16 = i12 + 4;
                        char cCharAt3 = charAt(i15);
                        if (z10 && cCharAt3 == '\"') {
                            cCharAt3 = charAt(i16);
                            i16 = i12 + 5;
                        }
                        while (cCharAt3 != ',') {
                            if (cCharAt3 == ']') {
                                this.f3983bp = i16;
                                this.f3984ch = charAt(i16);
                                this.matchStat = 5;
                                this.token = 15;
                                return 0L;
                            }
                            if (!JSONLexerBase.isWhitespace(cCharAt3)) {
                                this.matchStat = -1;
                                return 0L;
                            }
                            char cCharAt4 = charAt(i16);
                            i16++;
                            cCharAt3 = cCharAt4;
                        }
                        this.f3983bp = i16;
                        this.f3984ch = charAt(i16);
                        this.matchStat = 5;
                        this.token = 16;
                        return 0L;
                    }
                }
            }
        }
        this.matchStat = -1;
        return 0L;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public String scanTypeName(SymbolTable symbolTable) {
        int iIndexOf;
        if (!this.text.startsWith("\"@type\":\"", this.f3983bp) || (iIndexOf = this.text.indexOf(34, this.f3983bp + 9)) == -1) {
            return null;
        }
        int i10 = this.f3983bp + 9;
        this.f3983bp = i10;
        int iCharAt = 0;
        while (i10 < iIndexOf) {
            iCharAt = (iCharAt * 31) + this.text.charAt(i10);
            i10++;
        }
        int i11 = this.f3983bp;
        String strAddSymbol = addSymbol(i11, iIndexOf - i11, iCharAt, symbolTable);
        char cCharAt = this.text.charAt(iIndexOf + 1);
        if (cCharAt != ',' && cCharAt != ']') {
            return null;
        }
        int i12 = iIndexOf + 2;
        this.f3983bp = i12;
        this.f3984ch = this.text.charAt(i12);
        return strAddSymbol;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public boolean seekArrayToItem(int i10) throws NumberFormatException {
        if (i10 < 0) {
            throw new IllegalArgumentException("index must > 0, but " + i10);
        }
        int i11 = this.token;
        if (i11 == 20) {
            return false;
        }
        if (i11 != 14) {
            throw new UnsupportedOperationException();
        }
        for (int i12 = 0; i12 < i10; i12++) {
            skipWhitespace();
            char c10 = this.f3984ch;
            if (c10 == '\"' || c10 == '\'') {
                skipString();
                char c11 = this.f3984ch;
                if (c11 != ',') {
                    if (c11 != ']') {
                        throw new JSONException("illegal json.");
                    }
                    next();
                    nextToken(16);
                    return false;
                }
                next();
            } else {
                if (c10 == '{') {
                    next();
                    this.token = 12;
                    skipObject(false);
                } else {
                    if (c10 != '[') {
                        for (int i13 = this.f3983bp + 1; i13 < this.text.length(); i13++) {
                            char cCharAt = this.text.charAt(i13);
                            if (cCharAt == ',') {
                                int i14 = i13 + 1;
                                this.f3983bp = i14;
                                this.f3984ch = charAt(i14);
                            } else {
                                if (cCharAt == ']') {
                                    int i15 = i13 + 1;
                                    this.f3983bp = i15;
                                    this.f3984ch = charAt(i15);
                                    nextToken();
                                    return false;
                                }
                            }
                        }
                        throw new JSONException("illegal json.");
                    }
                    next();
                    this.token = 14;
                    skipArray(false);
                }
                int i16 = this.token;
                if (i16 != 16) {
                    if (i16 == 15) {
                        return false;
                    }
                    throw new UnsupportedOperationException();
                }
            }
        }
        nextToken();
        return true;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public int seekObjectToField(long j10, boolean z10) throws NumberFormatException {
        char c10;
        int i10 = this.token;
        int i11 = -1;
        if (i10 == 20) {
            return -1;
        }
        if (i10 != 13) {
            int i12 = 15;
            if (i10 != 15) {
                int i13 = 16;
                if (i10 != 12 && i10 != 16) {
                    throw new UnsupportedOperationException(JSONToken.name(this.token));
                }
                while (true) {
                    char c11 = this.f3984ch;
                    if (c11 == '}') {
                        next();
                        nextToken();
                        return i11;
                    }
                    char cCharAt = JSONLexer.EOI;
                    if (c11 == 26) {
                        return i11;
                    }
                    if (c11 != '\"') {
                        skipWhitespace();
                    }
                    if (this.f3984ch != '\"') {
                        throw new UnsupportedOperationException();
                    }
                    int i14 = this.f3983bp + 1;
                    long j11 = -3750763034362895579L;
                    while (true) {
                        if (i14 >= this.text.length()) {
                            break;
                        }
                        char cCharAt2 = this.text.charAt(i14);
                        if (cCharAt2 == '\\') {
                            i14++;
                            if (i14 == this.text.length()) {
                                throw new JSONException("unclosed str, " + info());
                            }
                            cCharAt2 = this.text.charAt(i14);
                        }
                        if (cCharAt2 == '\"') {
                            int i15 = i14 + 1;
                            this.f3983bp = i15;
                            this.f3984ch = i15 >= this.text.length() ? (char) 26 : this.text.charAt(this.f3983bp);
                        } else {
                            j11 = (j11 ^ cCharAt2) * 1099511628211L;
                            i14++;
                        }
                    }
                    int i16 = i11;
                    if (j11 == j10) {
                        if (this.f3984ch != ':') {
                            skipWhitespace();
                        }
                        if (this.f3984ch != ':') {
                            return 3;
                        }
                        int i17 = this.f3983bp + 1;
                        this.f3983bp = i17;
                        char cCharAt3 = i17 >= this.text.length() ? (char) 26 : this.text.charAt(i17);
                        this.f3984ch = cCharAt3;
                        if (cCharAt3 == ',') {
                            int i18 = this.f3983bp + 1;
                            this.f3983bp = i18;
                            if (i18 < this.text.length()) {
                                cCharAt = this.text.charAt(i18);
                            }
                            this.f3984ch = cCharAt;
                            this.token = i13;
                            return 3;
                        }
                        if (cCharAt3 == ']') {
                            int i19 = this.f3983bp + 1;
                            this.f3983bp = i19;
                            if (i19 < this.text.length()) {
                                cCharAt = this.text.charAt(i19);
                            }
                            this.f3984ch = cCharAt;
                            this.token = i12;
                            return 3;
                        }
                        if (cCharAt3 == '}') {
                            int i20 = this.f3983bp + 1;
                            this.f3983bp = i20;
                            if (i20 < this.text.length()) {
                                cCharAt = this.text.charAt(i20);
                            }
                            this.f3984ch = cCharAt;
                            this.token = 13;
                            return 3;
                        }
                        if (cCharAt3 < '0' || cCharAt3 > '9') {
                            nextToken(2);
                            return 3;
                        }
                        this.f3986sp = 0;
                        this.pos = this.f3983bp;
                        scanNumber();
                        return 3;
                    }
                    if (this.f3984ch != ':') {
                        skipWhitespace();
                    }
                    if (this.f3984ch != ':') {
                        throw new JSONException("illegal json, " + info());
                    }
                    int i21 = this.f3983bp + 1;
                    this.f3983bp = i21;
                    char cCharAt4 = i21 >= this.text.length() ? (char) 26 : this.text.charAt(i21);
                    this.f3984ch = cCharAt4;
                    if (cCharAt4 != '\"' && cCharAt4 != '\'' && cCharAt4 != '{' && cCharAt4 != '[' && cCharAt4 != '0' && cCharAt4 != '1' && cCharAt4 != '2' && cCharAt4 != '3' && cCharAt4 != '4' && cCharAt4 != '5' && cCharAt4 != '6' && cCharAt4 != '7' && cCharAt4 != '8' && cCharAt4 != '9' && cCharAt4 != '+' && cCharAt4 != '-') {
                        skipWhitespace();
                    }
                    char c12 = this.f3984ch;
                    if (c12 == '-' || c12 == '+' || (c12 >= '0' && c12 <= '9')) {
                        next();
                        while (true) {
                            c10 = this.f3984ch;
                            if (c10 < '0' || c10 > '9') {
                                break;
                            }
                            next();
                        }
                        if (c10 == '.') {
                            next();
                            while (true) {
                                char c13 = this.f3984ch;
                                if (c13 < '0' || c13 > '9') {
                                    break;
                                }
                                next();
                            }
                        }
                        char c14 = this.f3984ch;
                        if (c14 == 'E' || c14 == 'e') {
                            next();
                            char c15 = this.f3984ch;
                            if (c15 == '-' || c15 == '+') {
                                next();
                            }
                            while (true) {
                                char c16 = this.f3984ch;
                                if (c16 < '0' || c16 > '9') {
                                    break;
                                }
                                next();
                            }
                        }
                        if (this.f3984ch != ',') {
                            skipWhitespace();
                        }
                        if (this.f3984ch == ',') {
                            next();
                        }
                    } else if (c12 == '\"') {
                        skipString();
                        char c17 = this.f3984ch;
                        if (c17 != ',' && c17 != '}') {
                            skipWhitespace();
                        }
                        if (this.f3984ch == ',') {
                            next();
                        }
                    } else if (c12 == 't') {
                        next();
                        if (this.f3984ch == 'r') {
                            next();
                            if (this.f3984ch == 'u') {
                                next();
                                if (this.f3984ch == 'e') {
                                    next();
                                }
                            }
                        }
                        char c18 = this.f3984ch;
                        if (c18 != ',' && c18 != '}') {
                            skipWhitespace();
                        }
                        if (this.f3984ch == ',') {
                            next();
                        }
                    } else if (c12 == 'n') {
                        next();
                        if (this.f3984ch == 'u') {
                            next();
                            if (this.f3984ch == 'l') {
                                next();
                                if (this.f3984ch == 'l') {
                                    next();
                                }
                            }
                        }
                        char c19 = this.f3984ch;
                        if (c19 != ',' && c19 != '}') {
                            skipWhitespace();
                        }
                        if (this.f3984ch == ',') {
                            next();
                        }
                    } else if (c12 == 'f') {
                        next();
                        if (this.f3984ch == 'a') {
                            next();
                            if (this.f3984ch == 'l') {
                                next();
                                if (this.f3984ch == 's') {
                                    next();
                                    if (this.f3984ch == 'e') {
                                        next();
                                    }
                                }
                            }
                        }
                        char c20 = this.f3984ch;
                        if (c20 != ',' && c20 != '}') {
                            skipWhitespace();
                        }
                        if (this.f3984ch == ',') {
                            next();
                        }
                    } else if (c12 == '{') {
                        int i22 = this.f3983bp + 1;
                        this.f3983bp = i22;
                        this.f3984ch = i22 >= this.text.length() ? JSONLexer.EOI : this.text.charAt(i22);
                        if (z10) {
                            this.token = 12;
                            return 1;
                        }
                        skipObject(false);
                        if (this.token == 13) {
                            return i16;
                        }
                    } else {
                        if (c12 != '[') {
                            throw new UnsupportedOperationException();
                        }
                        next();
                        if (z10) {
                            this.token = 14;
                            return 2;
                        }
                        skipArray(false);
                        if (this.token == 13) {
                            return i16;
                        }
                    }
                    i11 = i16;
                    i12 = 15;
                    i13 = 16;
                }
            }
        }
        nextToken();
        return -1;
    }

    public void setTime(char c10, char c11, char c12, char c13, char c14, char c15) {
        this.calendar.set(11, ((c10 - '0') * 10) + (c11 - '0'));
        this.calendar.set(12, ((c12 - '0') * 10) + (c13 - '0'));
        this.calendar.set(13, ((c14 - '0') * 10) + (c15 - '0'));
    }

    public void setTimeZone(char c10, char c11, char c12) {
        setTimeZone(c10, c11, c12, '0', '0');
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final void skipArray() throws NumberFormatException {
        skipArray(false);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final void skipObject() throws NumberFormatException {
        skipObject(false);
    }

    public final void skipString() {
        if (this.f3984ch != '\"') {
            throw new UnsupportedOperationException();
        }
        int i10 = this.f3983bp;
        while (true) {
            i10++;
            if (i10 >= this.text.length()) {
                throw new JSONException("unclosed str");
            }
            char cCharAt = this.text.charAt(i10);
            if (cCharAt == '\\') {
                if (i10 < this.len - 1) {
                    i10++;
                }
            } else if (cCharAt == '\"') {
                String str = this.text;
                int i11 = i10 + 1;
                this.f3983bp = i11;
                this.f3984ch = str.charAt(i11);
                return;
            }
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final String stringVal() {
        return !this.hasSpecial ? subString(this.f3985np + 1, this.f3986sp) : new String(this.sbuf, 0, this.f3986sp);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final String subString(int i10, int i11) {
        if (!ASMUtils.IS_ANDROID) {
            return this.text.substring(i10, i11 + i10);
        }
        char[] cArr = this.sbuf;
        if (i11 < cArr.length) {
            this.text.getChars(i10, i10 + i11, cArr, 0);
            return new String(this.sbuf, 0, i11);
        }
        char[] cArr2 = new char[i11];
        this.text.getChars(i10, i11 + i10, cArr2, 0);
        return new String(cArr2);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final char[] sub_chars(int i10, int i11) {
        if (ASMUtils.IS_ANDROID) {
            char[] cArr = this.sbuf;
            if (i11 < cArr.length) {
                this.text.getChars(i10, i11 + i10, cArr, 0);
                return this.sbuf;
            }
        }
        char[] cArr2 = new char[i11];
        this.text.getChars(i10, i11 + i10, cArr2, 0);
        return cArr2;
    }

    public JSONScanner(String str, int i10) {
        super(i10);
        this.text = str;
        this.len = str.length();
        this.f3983bp = -1;
        next();
        if (this.f3984ch == 65279) {
            next();
        }
    }

    public boolean scanISO8601DateIfMatch(boolean z10) {
        return scanISO8601DateIfMatch(z10, this.len - this.f3983bp);
    }

    public void setTimeZone(char c10, char c11, char c12, char c13, char c14) {
        int i10 = ((((c11 - '0') * 10) + (c12 - '0')) * TimeConstants.HOUR) + ((((c13 - '0') * 10) + (c14 - '0')) * TimeConstants.MIN);
        if (c10 == '-') {
            i10 = -i10;
        }
        if (this.calendar.getTimeZone().getRawOffset() != i10) {
            this.calendar.setTimeZone(new SimpleTimeZone(i10, Integer.toString(i10)));
        }
    }

    public final void skipArray(boolean z10) throws NumberFormatException {
        int i10 = this.f3983bp;
        boolean z11 = false;
        int i11 = 0;
        while (i10 < this.text.length()) {
            char cCharAt = this.text.charAt(i10);
            if (cCharAt == '\\') {
                if (i10 >= this.len - 1) {
                    this.f3984ch = cCharAt;
                    this.f3983bp = i10;
                    throw new JSONException("illegal str, " + info());
                }
                i10++;
            } else if (cCharAt == '\"') {
                z11 = !z11;
            } else if (cCharAt != '[') {
                char cCharAt2 = JSONLexer.EOI;
                if (cCharAt == '{' && z10) {
                    int i12 = this.f3983bp + 1;
                    this.f3983bp = i12;
                    if (i12 < this.text.length()) {
                        cCharAt2 = this.text.charAt(i12);
                    }
                    this.f3984ch = cCharAt2;
                    skipObject(z10);
                } else if (cCharAt == ']' && !z11 && i11 - 1 == -1) {
                    int i13 = i10 + 1;
                    this.f3983bp = i13;
                    if (i13 == this.text.length()) {
                        this.f3984ch = JSONLexer.EOI;
                        this.token = 20;
                        return;
                    } else {
                        this.f3984ch = this.text.charAt(this.f3983bp);
                        nextToken(16);
                        return;
                    }
                }
            } else if (!z11) {
                i11++;
            }
            i10++;
        }
        if (i10 != this.text.length()) {
            return;
        }
        throw new JSONException("illegal str, " + info());
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final void skipObject(boolean z10) throws NumberFormatException {
        int i10 = this.f3983bp;
        boolean z11 = false;
        int i11 = 0;
        while (i10 < this.text.length()) {
            char cCharAt = this.text.charAt(i10);
            if (cCharAt == '\\') {
                if (i10 >= this.len - 1) {
                    this.f3984ch = cCharAt;
                    this.f3983bp = i10;
                    throw new JSONException("illegal str, " + info());
                }
                i10++;
            } else if (cCharAt == '\"') {
                z11 = !z11;
            } else if (cCharAt != '{') {
                if (cCharAt == '}' && !z11 && i11 - 1 == -1) {
                    int i12 = i10 + 1;
                    this.f3983bp = i12;
                    int length = this.text.length();
                    char cCharAt2 = JSONLexer.EOI;
                    if (i12 == length) {
                        this.f3984ch = JSONLexer.EOI;
                        this.token = 20;
                        return;
                    }
                    char cCharAt3 = this.text.charAt(this.f3983bp);
                    this.f3984ch = cCharAt3;
                    if (cCharAt3 == ',') {
                        this.token = 16;
                        int i13 = this.f3983bp + 1;
                        this.f3983bp = i13;
                        if (i13 < this.text.length()) {
                            cCharAt2 = this.text.charAt(i13);
                        }
                        this.f3984ch = cCharAt2;
                        return;
                    }
                    if (cCharAt3 == '}') {
                        this.token = 13;
                        next();
                        return;
                    } else if (cCharAt3 != ']') {
                        nextToken(16);
                        return;
                    } else {
                        this.token = 15;
                        next();
                        return;
                    }
                }
            } else if (!z11) {
                i11++;
            }
            i10++;
        }
        for (int i14 = 0; i14 < this.f3983bp; i14++) {
            if (i14 < this.text.length() && this.text.charAt(i14) == ' ') {
                i10++;
            }
        }
        if (i10 != this.text.length()) {
            return;
        }
        throw new JSONException("illegal str, " + info());
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean scanISO8601DateIfMatch(boolean r42, int r43) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONScanner.scanISO8601DateIfMatch(boolean, int):boolean");
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final boolean charArrayCompare(char[] cArr) {
        return charArrayCompare(this.text, this.f3983bp, cArr);
    }

    public JSONScanner(char[] cArr, int i10) {
        this(cArr, i10, JSON.DEFAULT_PARSER_FEATURE);
    }

    public JSONScanner(char[] cArr, int i10, int i11) {
        this(new String(cArr, 0, i10), i11);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public String[] scanFieldStringArray(char[] cArr, int i10, SymbolTable symbolTable) throws NumberFormatException {
        int i11;
        char cCharAt;
        int i12 = this.f3983bp;
        char c10 = this.f3984ch;
        while (JSONLexerBase.isWhitespace(this.f3984ch)) {
            next();
        }
        if (cArr != null) {
            this.matchStat = 0;
            if (!charArrayCompare(cArr)) {
                this.matchStat = -2;
                return null;
            }
            int length = this.f3983bp + cArr.length;
            int i13 = length + 1;
            char cCharAt2 = this.text.charAt(length);
            while (JSONLexerBase.isWhitespace(cCharAt2)) {
                cCharAt2 = this.text.charAt(i13);
                i13++;
            }
            if (cCharAt2 == ':') {
                i11 = i13 + 1;
                cCharAt = this.text.charAt(i13);
                while (JSONLexerBase.isWhitespace(cCharAt)) {
                    cCharAt = this.text.charAt(i11);
                    i11++;
                }
            } else {
                this.matchStat = -1;
                return null;
            }
        } else {
            i11 = this.f3983bp + 1;
            cCharAt = this.f3984ch;
        }
        if (cCharAt == '[') {
            this.f3983bp = i11;
            this.f3984ch = this.text.charAt(i11);
            String[] strArr = i10 >= 0 ? new String[i10] : new String[4];
            int i14 = 0;
            while (true) {
                if (JSONLexerBase.isWhitespace(this.f3984ch)) {
                    next();
                } else {
                    if (this.f3984ch != '\"') {
                        this.f3983bp = i12;
                        this.f3984ch = c10;
                        this.matchStat = -1;
                        return null;
                    }
                    String strScanSymbol = scanSymbol(symbolTable, '\"');
                    if (i14 == strArr.length) {
                        String[] strArr2 = new String[strArr.length + (strArr.length >> 1) + 1];
                        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                        strArr = strArr2;
                    }
                    int i15 = i14 + 1;
                    strArr[i14] = strScanSymbol;
                    while (JSONLexerBase.isWhitespace(this.f3984ch)) {
                        next();
                    }
                    if (this.f3984ch == ',') {
                        next();
                        i14 = i15;
                    } else {
                        if (strArr.length != i15) {
                            String[] strArr3 = new String[i15];
                            System.arraycopy(strArr, 0, strArr3, 0, i15);
                            strArr = strArr3;
                        }
                        while (JSONLexerBase.isWhitespace(this.f3984ch)) {
                            next();
                        }
                        if (this.f3984ch == ']') {
                            next();
                            return strArr;
                        }
                        this.f3983bp = i12;
                        this.f3984ch = c10;
                        this.matchStat = -1;
                        return null;
                    }
                }
            }
        } else {
            if (cCharAt == 'n' && this.text.startsWith("ull", this.f3983bp + 1)) {
                int i16 = this.f3983bp + 4;
                this.f3983bp = i16;
                this.f3984ch = this.text.charAt(i16);
                return null;
            }
            this.matchStat = -1;
            return null;
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public int seekObjectToField(long[] jArr) throws NumberFormatException {
        char c10;
        int i10 = this.token;
        if (i10 != 12 && i10 != 16) {
            throw new UnsupportedOperationException();
        }
        while (true) {
            char c11 = this.f3984ch;
            if (c11 == '}') {
                next();
                nextToken();
                this.matchStat = -1;
                return -1;
            }
            char cCharAt = JSONLexer.EOI;
            if (c11 == 26) {
                this.matchStat = -1;
                return -1;
            }
            if (c11 != '\"') {
                skipWhitespace();
            }
            if (this.f3984ch == '\"') {
                int i11 = this.f3983bp + 1;
                long j10 = -3750763034362895579L;
                while (true) {
                    if (i11 >= this.text.length()) {
                        break;
                    }
                    char cCharAt2 = this.text.charAt(i11);
                    if (cCharAt2 == '\\') {
                        i11++;
                        if (i11 != this.text.length()) {
                            cCharAt2 = this.text.charAt(i11);
                        } else {
                            throw new JSONException("unclosed str, " + info());
                        }
                    }
                    if (cCharAt2 == '\"') {
                        int i12 = i11 + 1;
                        this.f3983bp = i12;
                        this.f3984ch = i12 >= this.text.length() ? (char) 26 : this.text.charAt(this.f3983bp);
                    } else {
                        j10 = (j10 ^ cCharAt2) * 1099511628211L;
                        i11++;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= jArr.length) {
                        i13 = -1;
                        break;
                    }
                    if (j10 == jArr[i13]) {
                        break;
                    }
                    i13++;
                }
                if (i13 != -1) {
                    if (this.f3984ch != ':') {
                        skipWhitespace();
                    }
                    if (this.f3984ch == ':') {
                        int i14 = this.f3983bp + 1;
                        this.f3983bp = i14;
                        char cCharAt3 = i14 >= this.text.length() ? (char) 26 : this.text.charAt(i14);
                        this.f3984ch = cCharAt3;
                        if (cCharAt3 == ',') {
                            int i15 = this.f3983bp + 1;
                            this.f3983bp = i15;
                            if (i15 < this.text.length()) {
                                cCharAt = this.text.charAt(i15);
                            }
                            this.f3984ch = cCharAt;
                            this.token = 16;
                        } else if (cCharAt3 == ']') {
                            int i16 = this.f3983bp + 1;
                            this.f3983bp = i16;
                            if (i16 < this.text.length()) {
                                cCharAt = this.text.charAt(i16);
                            }
                            this.f3984ch = cCharAt;
                            this.token = 15;
                        } else if (cCharAt3 == '}') {
                            int i17 = this.f3983bp + 1;
                            this.f3983bp = i17;
                            if (i17 < this.text.length()) {
                                cCharAt = this.text.charAt(i17);
                            }
                            this.f3984ch = cCharAt;
                            this.token = 13;
                        } else if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                            this.f3986sp = 0;
                            this.pos = this.f3983bp;
                            scanNumber();
                        } else {
                            nextToken(2);
                        }
                    }
                    this.matchStat = 3;
                    return i13;
                }
                if (this.f3984ch != ':') {
                    skipWhitespace();
                }
                if (this.f3984ch == ':') {
                    int i18 = this.f3983bp + 1;
                    this.f3983bp = i18;
                    char cCharAt4 = i18 >= this.text.length() ? (char) 26 : this.text.charAt(i18);
                    this.f3984ch = cCharAt4;
                    if (cCharAt4 != '\"' && cCharAt4 != '\'' && cCharAt4 != '{' && cCharAt4 != '[' && cCharAt4 != '0' && cCharAt4 != '1' && cCharAt4 != '2' && cCharAt4 != '3' && cCharAt4 != '4' && cCharAt4 != '5' && cCharAt4 != '6' && cCharAt4 != '7' && cCharAt4 != '8' && cCharAt4 != '9' && cCharAt4 != '+' && cCharAt4 != '-') {
                        skipWhitespace();
                    }
                    char c12 = this.f3984ch;
                    if (c12 == '-' || c12 == '+' || (c12 >= '0' && c12 <= '9')) {
                        next();
                        while (true) {
                            c10 = this.f3984ch;
                            if (c10 < '0' || c10 > '9') {
                                break;
                            }
                            next();
                        }
                        if (c10 == '.') {
                            next();
                            while (true) {
                                char c13 = this.f3984ch;
                                if (c13 < '0' || c13 > '9') {
                                    break;
                                }
                                next();
                            }
                        }
                        char c14 = this.f3984ch;
                        if (c14 == 'E' || c14 == 'e') {
                            next();
                            char c15 = this.f3984ch;
                            if (c15 == '-' || c15 == '+') {
                                next();
                            }
                            while (true) {
                                char c16 = this.f3984ch;
                                if (c16 < '0' || c16 > '9') {
                                    break;
                                }
                                next();
                            }
                        }
                        if (this.f3984ch != ',') {
                            skipWhitespace();
                        }
                        if (this.f3984ch == ',') {
                            next();
                        }
                    } else if (c12 == '\"') {
                        skipString();
                        char c17 = this.f3984ch;
                        if (c17 != ',' && c17 != '}') {
                            skipWhitespace();
                        }
                        if (this.f3984ch == ',') {
                            next();
                        }
                    } else if (c12 == '{') {
                        int i19 = this.f3983bp + 1;
                        this.f3983bp = i19;
                        if (i19 < this.text.length()) {
                            cCharAt = this.text.charAt(i19);
                        }
                        this.f3984ch = cCharAt;
                        skipObject(false);
                    } else if (c12 == '[') {
                        next();
                        skipArray(false);
                    } else {
                        throw new UnsupportedOperationException();
                    }
                } else {
                    throw new JSONException("illegal json, " + info());
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }
}
