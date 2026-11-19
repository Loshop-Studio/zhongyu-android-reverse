package com.alibaba.fastjson.parser;

import androidx.camera.video.AudioStats;
import androidx.collection.SieveCacheKt;
import androidx.compose.material3.MenuKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import anetwork.channel.util.RequestConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.util.IOUtils;
import com.taobao.sophix.PatchStatus;
import com.tendcloud.tenddata.C7843ab;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes3.dex */
public abstract class JSONLexerBase implements JSONLexer, Closeable {
    protected static final int INT_MULTMIN_RADIX_TEN = -214748364;
    protected static final long MULTMIN_RADIX_TEN = -922337203685477580L;

    /* renamed from: bp */
    protected int f3983bp;

    /* renamed from: ch */
    protected char f3984ch;
    protected int eofPos;
    protected int features;
    protected boolean hasSpecial;

    /* renamed from: np */
    protected int f3985np;
    protected int pos;
    protected char[] sbuf;

    /* renamed from: sp */
    protected int f3986sp;
    protected String stringDefaultValue;
    protected int token;
    private static final ThreadLocal<char[]> SBUF_LOCAL = new ThreadLocal<>();
    protected static final char[] typeFieldName = ("\"" + JSON.DEFAULT_TYPE_KEY + "\":\"").toCharArray();
    protected static final int[] digits = new int[103];
    protected Calendar calendar = null;
    protected TimeZone timeZone = JSON.defaultTimeZone;
    protected Locale locale = JSON.defaultLocale;
    public int matchStat = 0;
    protected int nanos = 0;

    static {
        for (int i10 = 48; i10 <= 57; i10++) {
            digits[i10] = i10 - 48;
        }
        for (int i11 = 97; i11 <= 102; i11++) {
            digits[i11] = i11 - 87;
        }
        for (int i12 = 65; i12 <= 70; i12++) {
            digits[i12] = i12 - 55;
        }
    }

    public JSONLexerBase(int i10) {
        this.stringDefaultValue = null;
        this.features = i10;
        if ((i10 & Feature.InitStringFieldAsEmpty.mask) != 0) {
            this.stringDefaultValue = "";
        }
        char[] cArr = SBUF_LOCAL.get();
        this.sbuf = cArr;
        if (cArr == null) {
            this.sbuf = new char[512];
        }
    }

    public static boolean isWhitespace(char c10) {
        if (c10 <= ' ') {
            return c10 == ' ' || c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == '\f' || c10 == '\b';
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String readString(char[] r16, int r17) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.readString(char[], int):java.lang.String");
    }

    private void scanStringSingleQuote() throws NumberFormatException {
        char next;
        char next2;
        this.f3985np = this.f3983bp;
        this.hasSpecial = false;
        while (true) {
            char next3 = next();
            if (next3 == '\'') {
                this.token = 4;
                next();
                return;
            }
            if (next3 != 26) {
                boolean z10 = true;
                if (next3 == '\\') {
                    if (!this.hasSpecial) {
                        this.hasSpecial = true;
                        int i10 = this.f3986sp;
                        char[] cArr = this.sbuf;
                        if (i10 > cArr.length) {
                            char[] cArr2 = new char[i10 * 2];
                            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                            this.sbuf = cArr2;
                        }
                        copyTo(this.f3985np + 1, this.f3986sp, this.sbuf);
                    }
                    char next4 = next();
                    if (next4 == '\"') {
                        putChar('\"');
                    } else if (next4 != '\'') {
                        if (next4 != 'F') {
                            if (next4 == '\\') {
                                putChar('\\');
                            } else if (next4 == 'b') {
                                putChar('\b');
                            } else if (next4 != 'f') {
                                if (next4 == 'n') {
                                    putChar('\n');
                                } else if (next4 == 'r') {
                                    putChar('\r');
                                } else if (next4 != 'x') {
                                    switch (next4) {
                                        case '/':
                                            putChar('/');
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                            putChar((char) 0);
                                            break;
                                        case '1':
                                            putChar((char) 1);
                                            break;
                                        case '2':
                                            putChar((char) 2);
                                            break;
                                        case '3':
                                            putChar((char) 3);
                                            break;
                                        case '4':
                                            putChar((char) 4);
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                            putChar((char) 5);
                                            break;
                                        case '6':
                                            putChar((char) 6);
                                            break;
                                        case '7':
                                            putChar((char) 7);
                                            break;
                                        default:
                                            switch (next4) {
                                                case 't':
                                                    putChar('\t');
                                                    break;
                                                case 'u':
                                                    putChar((char) Integer.parseInt(new String(new char[]{next(), next(), next(), next()}), 16));
                                                    break;
                                                case 'v':
                                                    putChar((char) 11);
                                                    break;
                                                default:
                                                    this.f3984ch = next4;
                                                    throw new JSONException("unclosed single-quote string");
                                            }
                                    }
                                } else {
                                    next = next();
                                    next2 = next();
                                    boolean z11 = (next >= '0' && next <= '9') || (next >= 'a' && next <= 'f') || (next >= 'A' && next <= 'F');
                                    if ((next2 < '0' || next2 > '9') && ((next2 < 'a' || next2 > 'f') && (next2 < 'A' || next2 > 'F'))) {
                                        z10 = false;
                                    }
                                    if (z11 && z10) {
                                        int[] iArr = digits;
                                        putChar((char) ((iArr[next] * 16) + iArr[next2]));
                                    }
                                }
                            }
                        }
                        putChar('\f');
                    } else {
                        putChar('\'');
                    }
                } else if (this.hasSpecial) {
                    int i11 = this.f3986sp;
                    char[] cArr3 = this.sbuf;
                    if (i11 == cArr3.length) {
                        putChar(next3);
                    } else {
                        this.f3986sp = i11 + 1;
                        cArr3[i11] = next3;
                    }
                } else {
                    this.f3986sp++;
                }
            } else {
                if (isEOF()) {
                    throw new JSONException("unclosed single-quote string");
                }
                putChar(JSONLexer.EOI);
            }
        }
        throw new JSONException("invalid escape character \\x" + next + next2);
    }

    public abstract String addSymbol(int i10, int i11, int i12, SymbolTable symbolTable);

    public abstract void arrayCopy(int i10, char[] cArr, int i11, int i12);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract byte[] bytesValue();

    public abstract boolean charArrayCompare(char[] cArr);

    public abstract char charAt(int i10);

    @Override // com.alibaba.fastjson.parser.JSONLexer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        char[] cArr = this.sbuf;
        if (cArr.length <= 8192) {
            SBUF_LOCAL.set(cArr);
        }
        this.sbuf = null;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void config(Feature feature, boolean z10) {
        int iConfig = Feature.config(this.features, feature, z10);
        this.features = iConfig;
        if ((iConfig & Feature.InitStringFieldAsEmpty.mask) != 0) {
            this.stringDefaultValue = "";
        }
    }

    public abstract void copyTo(int i10, int i11, char[] cArr);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final Number decimalValue(boolean z10) {
        char cCharAt = charAt((this.f3985np + this.f3986sp) - 1);
        try {
            return cCharAt == 'F' ? Float.valueOf(Float.parseFloat(numberString())) : cCharAt == 'D' ? Double.valueOf(Double.parseDouble(numberString())) : z10 ? decimalValue() : Double.valueOf(doubleValue());
        } catch (NumberFormatException e10) {
            throw new JSONException(e10.getMessage() + ", " + info());
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract BigDecimal decimalValue();

    public double doubleValue() {
        return Double.parseDouble(numberString());
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public float floatValue() throws NumberFormatException {
        char cCharAt;
        String strNumberString = numberString();
        float f10 = Float.parseFloat(strNumberString);
        if ((f10 != 0.0f && f10 != Float.POSITIVE_INFINITY) || (cCharAt = strNumberString.charAt(0)) <= '0' || cCharAt > '9') {
            return f10;
        }
        throw new JSONException("float overflow : " + strNumberString);
    }

    public Calendar getCalendar() {
        return this.calendar;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final char getCurrent() {
        return this.f3984ch;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public int getFeatures() {
        return this.features;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public Locale getLocale() {
        return this.locale;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public abstract int indexOf(char c10, int i10);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public String info() {
        return "";
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final int intValue() {
        int i10;
        boolean z10;
        int i11 = 0;
        if (this.f3985np == -1) {
            this.f3985np = 0;
        }
        int i12 = this.f3985np;
        int i13 = this.f3986sp + i12;
        if (charAt(i12) == '-') {
            i12++;
            i10 = Integer.MIN_VALUE;
            z10 = true;
        } else {
            i10 = -2147483647;
            z10 = false;
        }
        if (i12 < i13) {
            i11 = -(charAt(i12) - '0');
            i12++;
        }
        while (i12 < i13) {
            int i14 = i12 + 1;
            char cCharAt = charAt(i12);
            if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B') {
                i12 = i14;
                break;
            }
            int i15 = cCharAt - '0';
            if (i11 < -214748364) {
                throw new NumberFormatException(numberString());
            }
            int i16 = i11 * 10;
            if (i16 < i10 + i15) {
                throw new NumberFormatException(numberString());
            }
            i11 = i16 - i15;
            i12 = i14;
        }
        if (!z10) {
            return -i11;
        }
        if (i12 > this.f3985np + 1) {
            return i11;
        }
        throw new NumberFormatException(numberString());
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final Number integerValue() {
        char c10;
        long j10;
        long j11;
        boolean z10 = false;
        if (this.f3985np == -1) {
            this.f3985np = 0;
        }
        int i10 = this.f3985np;
        int i11 = this.f3986sp + i10;
        char cCharAt = charAt(i11 - 1);
        if (cCharAt == 'B') {
            i11--;
            c10 = 'B';
        } else if (cCharAt == 'L') {
            i11--;
            c10 = 'L';
        } else if (cCharAt != 'S') {
            c10 = ' ';
        } else {
            i11--;
            c10 = 'S';
        }
        if (charAt(this.f3985np) == '-') {
            i10++;
            j10 = Long.MIN_VALUE;
            z10 = true;
        } else {
            j10 = -9223372036854775807L;
        }
        if (i10 < i11) {
            j11 = -(charAt(i10) - '0');
            i10++;
        } else {
            j11 = 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            int iCharAt = charAt(i10) - '0';
            if (j11 < -922337203685477580L) {
                return new BigInteger(numberString(), 10);
            }
            long j12 = j11 * 10;
            long j13 = iCharAt;
            if (j12 < j10 + j13) {
                return new BigInteger(numberString(), 10);
            }
            j11 = j12 - j13;
            i10 = i12;
        }
        if (!z10) {
            long j14 = -j11;
            return (j14 > SieveCacheKt.NodeLinkMask || c10 == 'L') ? Long.valueOf(j14) : c10 == 'S' ? Short.valueOf((short) j14) : c10 == 'B' ? Byte.valueOf((byte) j14) : Integer.valueOf((int) j14);
        }
        if (i10 > this.f3985np + 1) {
            return (j11 < SieveCacheKt.NodeMetaAndPreviousMask || c10 == 'L') ? Long.valueOf(j11) : c10 == 'S' ? Short.valueOf((short) j11) : c10 == 'B' ? Byte.valueOf((byte) j11) : Integer.valueOf((int) j11);
        }
        throw new NumberFormatException(numberString());
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public boolean isBlankInput() {
        int i10 = 0;
        while (true) {
            char cCharAt = charAt(i10);
            if (cCharAt == 26) {
                this.token = 20;
                return true;
            }
            if (!isWhitespace(cCharAt)) {
                return false;
            }
            i10++;
        }
    }

    public abstract boolean isEOF();

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final boolean isEnabled(Feature feature) {
        return isEnabled(feature.mask);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final boolean isRef() {
        return this.f3986sp == 4 && charAt(this.f3985np + 1) == '$' && charAt(this.f3985np + 2) == 'r' && charAt(this.f3985np + 3) == 'e' && charAt(this.f3985np + 4) == 'f';
    }

    public void lexError(String str, Object... objArr) {
        this.token = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005c -> B:11:0x002e). Please report as a decompilation issue!!! */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long longValue() {
        /*
            r13 = this;
            int r0 = r13.f3985np
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L8
            r13.f3985np = r2
        L8:
            int r0 = r13.f3985np
            int r1 = r13.f3986sp
            int r1 = r1 + r0
            char r3 = r13.charAt(r0)
            r4 = 45
            r5 = 1
            if (r3 != r4) goto L1d
            int r0 = r0 + 1
            r2 = -9223372036854775808
            r3 = r2
            r2 = r5
            goto L22
        L1d:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L22:
            if (r0 >= r1) goto L30
            int r6 = r0 + 1
            char r0 = r13.charAt(r0)
            int r0 = r0 + (-48)
            int r0 = -r0
            long r7 = (long) r0
        L2e:
            r0 = r6
            goto L32
        L30:
            r7 = 0
        L32:
            if (r0 >= r1) goto L73
            int r6 = r0 + 1
            char r0 = r13.charAt(r0)
            r9 = 76
            if (r0 == r9) goto L72
            r9 = 83
            if (r0 == r9) goto L72
            r9 = 66
            if (r0 != r9) goto L47
            goto L72
        L47:
            int r0 = r0 + (-48)
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 < 0) goto L68
            r9 = 10
            long r7 = r7 * r9
            long r9 = (long) r0
            long r11 = r3 + r9
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L5e
            long r7 = r7 - r9
            goto L2e
        L5e:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L68:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L72:
            r0 = r6
        L73:
            if (r2 == 0) goto L85
            int r1 = r13.f3985np
            int r1 = r1 + r5
            if (r0 <= r1) goto L7b
            return r7
        L7b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L85:
            long r0 = -r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.longValue():long");
    }

    public final boolean matchField(char[] cArr) throws NumberFormatException {
        while (!charArrayCompare(cArr)) {
            if (!isWhitespace(this.f3984ch)) {
                return false;
            }
            next();
        }
        int length = this.f3983bp + cArr.length;
        this.f3983bp = length;
        char cCharAt = charAt(length);
        this.f3984ch = cCharAt;
        if (cCharAt == '{') {
            next();
            this.token = 12;
        } else if (cCharAt == '[') {
            next();
            this.token = 14;
        } else if (cCharAt == 'S' && charAt(this.f3983bp + 1) == 'e' && charAt(this.f3983bp + 2) == 't' && charAt(this.f3983bp + 3) == '[') {
            int i10 = this.f3983bp + 3;
            this.f3983bp = i10;
            this.f3984ch = charAt(i10);
            this.token = 21;
        } else {
            nextToken();
        }
        return true;
    }

    public boolean matchField2(char[] cArr) {
        throw new UnsupportedOperationException();
    }

    public final int matchStat() {
        return this.matchStat;
    }

    public Collection<String> newCollectionByType(Class<?> cls) {
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(LinkedList.class)) {
            return new LinkedList();
        }
        try {
            return (Collection) cls.newInstance();
        } catch (Exception e10) {
            throw new JSONException(e10.getMessage(), e10);
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract char next();

    public final void nextIdent() throws NumberFormatException {
        while (isWhitespace(this.f3984ch)) {
            next();
        }
        char c10 = this.f3984ch;
        if (c10 == '_' || c10 == '$' || Character.isLetter(c10)) {
            scanIdent();
        } else {
            nextToken();
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextToken() throws NumberFormatException {
        this.f3986sp = 0;
        while (true) {
            this.pos = this.f3983bp;
            char c10 = this.f3984ch;
            if (c10 == '/') {
                skipComment();
            } else {
                if (c10 == '\"') {
                    scanString();
                    return;
                }
                if (c10 == ',') {
                    next();
                    this.token = 16;
                    return;
                }
                if (c10 >= '0' && c10 <= '9') {
                    scanNumber();
                    return;
                }
                if (c10 != '-') {
                    switch (c10) {
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                        case ' ':
                            next();
                            break;
                        case '\'':
                            if (!isEnabled(Feature.AllowSingleQuotes)) {
                                throw new JSONException("Feature.AllowSingleQuotes is false");
                            }
                            scanStringSingleQuote();
                            return;
                        case '(':
                            next();
                            this.token = 10;
                            return;
                        case ')':
                            next();
                            this.token = 11;
                            return;
                        case '+':
                            next();
                            scanNumber();
                            return;
                        case '.':
                            next();
                            this.token = 25;
                            return;
                        case Opcodes.ASTORE /* 58 */:
                            next();
                            this.token = 17;
                            return;
                        case ';':
                            next();
                            this.token = 24;
                            return;
                        case PatchStatus.CODE_LOAD_JIT_CLEAR /* 78 */:
                        case PatchStatus.CODE_LOAD_FIND_CONSTRUCTOR /* 83 */:
                        case PatchStatus.CODE_LOAD_FIND_METHOD /* 84 */:
                        case 'u':
                            scanIdent();
                            return;
                        case C7843ab.b.API_MYNA_START /* 91 */:
                            next();
                            this.token = 14;
                            return;
                        case ']':
                            next();
                            this.token = 15;
                            return;
                        case 'f':
                            scanFalse();
                            return;
                        case IjkMediaMeta.FF_PROFILE_H264_HIGH_10 /* 110 */:
                            scanNullOrNew();
                            return;
                        case 't':
                            scanTrue();
                            return;
                        case MenuKt.InTransitionDuration /* 120 */:
                            scanHex();
                            return;
                        case PatchStatus.CODE_LOAD_RES_ADDASSERTPATH /* 123 */:
                            next();
                            this.token = 12;
                            return;
                        case '}':
                            next();
                            this.token = 13;
                            return;
                        default:
                            if (isEOF()) {
                                if (this.token == 20) {
                                    throw new JSONException("EOF error");
                                }
                                this.token = 20;
                                int i10 = this.f3983bp;
                                this.pos = i10;
                                this.eofPos = i10;
                                return;
                            }
                            char c11 = this.f3984ch;
                            if (c11 > 31 && c11 != 127) {
                                lexError("illegal.char", String.valueOf((int) c11));
                                next();
                                return;
                            } else {
                                next();
                                break;
                            }
                            break;
                    }
                } else {
                    scanNumber();
                    return;
                }
            }
        }
    }

    public final void nextTokenWithChar(char c10) throws NumberFormatException {
        this.f3986sp = 0;
        while (true) {
            char c11 = this.f3984ch;
            if (c11 == c10) {
                next();
                nextToken();
                return;
            }
            if (c11 != ' ' && c11 != '\n' && c11 != '\r' && c11 != '\t' && c11 != '\f' && c11 != '\b') {
                throw new JSONException("not match " + c10 + " - " + this.f3984ch + ", info : " + info());
            }
            next();
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextTokenWithColon() throws NumberFormatException {
        nextTokenWithChar(':');
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract String numberString();

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final int pos() {
        return this.pos;
    }

    public final void putChar(char c10) {
        int i10 = this.f3986sp;
        char[] cArr = this.sbuf;
        if (i10 == cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            this.sbuf = cArr2;
        }
        char[] cArr3 = this.sbuf;
        int i11 = this.f3986sp;
        this.f3986sp = i11 + 1;
        cArr3[i11] = c10;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void resetStringPosition() {
        this.f3986sp = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean scanBoolean(char r10) {
        /*
            r9 = this;
            r0 = 0
            r9.matchStat = r0
            int r1 = r9.f3983bp
            char r1 = r9.charAt(r1)
            r2 = 116(0x74, float:1.63E-43)
            r3 = 5
            r4 = 101(0x65, float:1.42E-43)
            r5 = -1
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 != r2) goto L40
            int r1 = r9.f3983bp
            int r1 = r1 + r8
            char r1 = r9.charAt(r1)
            r2 = 114(0x72, float:1.6E-43)
            if (r1 != r2) goto L3d
            int r1 = r9.f3983bp
            int r1 = r1 + r7
            char r1 = r9.charAt(r1)
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L3d
            int r1 = r9.f3983bp
            int r1 = r1 + r6
            char r1 = r9.charAt(r1)
            if (r1 != r4) goto L3d
            int r0 = r9.f3983bp
            int r0 = r0 + 4
            char r1 = r9.charAt(r0)
        L3b:
            r0 = r8
            goto L96
        L3d:
            r9.matchStat = r5
            return r0
        L40:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 != r2) goto L7b
            int r1 = r9.f3983bp
            int r1 = r1 + r8
            char r1 = r9.charAt(r1)
            r2 = 97
            if (r1 != r2) goto L78
            int r1 = r9.f3983bp
            int r1 = r1 + r7
            char r1 = r9.charAt(r1)
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 != r2) goto L78
            int r1 = r9.f3983bp
            int r1 = r1 + r6
            char r1 = r9.charAt(r1)
            r2 = 115(0x73, float:1.61E-43)
            if (r1 != r2) goto L78
            int r1 = r9.f3983bp
            int r1 = r1 + 4
            char r1 = r9.charAt(r1)
            if (r1 != r4) goto L78
            int r1 = r9.f3983bp
            int r1 = r1 + r3
            char r1 = r9.charAt(r1)
            r3 = 6
            goto L96
        L78:
            r9.matchStat = r5
            return r0
        L7b:
            r2 = 49
            if (r1 != r2) goto L88
            int r0 = r9.f3983bp
            int r0 = r0 + r8
            char r1 = r9.charAt(r0)
            r3 = r7
            goto L3b
        L88:
            r2 = 48
            if (r1 != r2) goto L95
            int r1 = r9.f3983bp
            int r1 = r1 + r8
            char r1 = r9.charAt(r1)
            r3 = r7
            goto L96
        L95:
            r3 = r8
        L96:
            if (r1 != r10) goto La6
            int r10 = r9.f3983bp
            int r10 = r10 + r3
            r9.f3983bp = r10
            char r10 = r9.charAt(r10)
            r9.f3984ch = r10
            r9.matchStat = r6
            return r0
        La6:
            boolean r1 = isWhitespace(r1)
            if (r1 == 0) goto Lb7
            int r1 = r9.f3983bp
            int r2 = r3 + 1
            int r1 = r1 + r3
            char r1 = r9.charAt(r1)
            r3 = r2
            goto L96
        Lb7:
            r9.matchStat = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanBoolean(char):boolean");
    }

    public Date scanDate(char c10) {
        char cCharAt;
        int i10;
        long j10;
        Date date;
        int i11;
        char cCharAt2;
        boolean z10 = false;
        this.matchStat = 0;
        char cCharAt3 = charAt(this.f3983bp);
        int i12 = 1;
        if (cCharAt3 == '\"') {
            int iIndexOf = indexOf('\"', this.f3983bp + 1);
            if (iIndexOf == -1) {
                throw new JSONException("unclosed str");
            }
            int i13 = this.f3983bp + 1;
            String strSubString = subString(i13, iIndexOf - i13);
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
                int i17 = iIndexOf - (i16 + 1);
                strSubString = readString(sub_chars(i16 + 1, i17), i17);
            }
            int i18 = this.f3983bp;
            int i19 = iIndexOf - (i18 + 1);
            int i20 = i19 + 2;
            i10 = i19 + 3;
            cCharAt = charAt(i18 + i20);
            JSONScanner jSONScanner = new JSONScanner(strSubString);
            try {
                if (!jSONScanner.scanISO8601DateIfMatch(false)) {
                    this.matchStat = -1;
                    return null;
                }
                date = jSONScanner.getCalendar().getTime();
            } finally {
                jSONScanner.close();
            }
        } else {
            char c11 = '9';
            if (cCharAt3 == '-' || (cCharAt3 >= '0' && cCharAt3 <= '9')) {
                if (cCharAt3 == '-') {
                    cCharAt3 = charAt(this.f3983bp + 1);
                    z10 = true;
                    i12 = 2;
                }
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    int i21 = i12;
                    cCharAt = cCharAt3;
                    i10 = i21;
                    j10 = 0;
                } else {
                    j10 = cCharAt3 - '0';
                    while (true) {
                        i11 = i12 + 1;
                        cCharAt2 = charAt(this.f3983bp + i12);
                        if (cCharAt2 < '0' || cCharAt2 > c11) {
                            break;
                        }
                        j10 = (j10 * 10) + (cCharAt2 - '0');
                        i12 = i11;
                        c11 = '9';
                    }
                    cCharAt = cCharAt2;
                    i10 = i11;
                }
                if (j10 < 0) {
                    this.matchStat = -1;
                    return null;
                }
                if (z10) {
                    j10 = -j10;
                }
                date = new Date(j10);
            } else {
                if (cCharAt3 != 'n' || charAt(this.f3983bp + 1) != 'u' || charAt(this.f3983bp + 2) != 'l' || charAt(this.f3983bp + 3) != 'l') {
                    this.matchStat = -1;
                    return null;
                }
                i10 = 5;
                this.matchStat = 5;
                cCharAt = charAt(this.f3983bp + 4);
                date = null;
            }
        }
        if (cCharAt == ',') {
            int i22 = this.f3983bp + i10;
            this.f3983bp = i22;
            this.f3984ch = charAt(i22);
            this.matchStat = 3;
            this.token = 16;
            return date;
        }
        if (cCharAt != ']') {
            this.matchStat = -1;
            return null;
        }
        int i23 = i10 + 1;
        char cCharAt4 = charAt(this.f3983bp + i10);
        if (cCharAt4 == ',') {
            this.token = 16;
            int i24 = this.f3983bp + i23;
            this.f3983bp = i24;
            this.f3984ch = charAt(i24);
        } else if (cCharAt4 == ']') {
            this.token = 15;
            int i25 = this.f3983bp + i23;
            this.f3983bp = i25;
            this.f3984ch = charAt(i25);
        } else if (cCharAt4 == '}') {
            this.token = 13;
            int i26 = this.f3983bp + i23;
            this.f3983bp = i26;
            this.f3984ch = charAt(i26);
        } else {
            if (cCharAt4 != 26) {
                this.matchStat = -1;
                return null;
            }
            this.token = 20;
            this.f3983bp += i10;
            this.f3984ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return date;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00a1 -> B:39:0x0091). Please report as a decompilation issue!!! */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.math.BigDecimal scanDecimal(char r19) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanDecimal(char):java.math.BigDecimal");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00ca -> B:49:0x00ba). Please report as a decompilation issue!!! */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double scanDouble(char r25) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanDouble(char):double");
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public Enum<?> scanEnum(Class<?> cls, SymbolTable symbolTable, char c10) {
        String strScanSymbolWithSeperator = scanSymbolWithSeperator(symbolTable, c10);
        if (strScanSymbolWithSeperator == null) {
            return null;
        }
        return Enum.valueOf(cls, strScanSymbolWithSeperator);
    }

    public long scanEnumSymbol(char[] cArr) {
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0L;
        }
        int length = cArr.length;
        int i10 = length + 1;
        if (charAt(this.f3983bp + length) != '\"') {
            this.matchStat = -1;
            return 0L;
        }
        long j10 = -3750763034362895579L;
        while (true) {
            int i11 = i10 + 1;
            char cCharAt = charAt(this.f3983bp + i10);
            if (cCharAt == '\"') {
                int i12 = i10 + 2;
                char cCharAt2 = charAt(this.f3983bp + i11);
                if (cCharAt2 == ',') {
                    int i13 = this.f3983bp + i12;
                    this.f3983bp = i13;
                    this.f3984ch = charAt(i13);
                    this.matchStat = 3;
                    return j10;
                }
                if (cCharAt2 != '}') {
                    this.matchStat = -1;
                    return 0L;
                }
                int i14 = i10 + 3;
                char cCharAt3 = charAt(this.f3983bp + i12);
                if (cCharAt3 == ',') {
                    this.token = 16;
                    int i15 = this.f3983bp + i14;
                    this.f3983bp = i15;
                    this.f3984ch = charAt(i15);
                } else if (cCharAt3 == ']') {
                    this.token = 15;
                    int i16 = this.f3983bp + i14;
                    this.f3983bp = i16;
                    this.f3984ch = charAt(i16);
                } else if (cCharAt3 == '}') {
                    this.token = 13;
                    int i17 = this.f3983bp + i14;
                    this.f3983bp = i17;
                    this.f3984ch = charAt(i17);
                } else {
                    if (cCharAt3 != 26) {
                        this.matchStat = -1;
                        return 0L;
                    }
                    this.token = 20;
                    this.f3983bp += i10 + 2;
                    this.f3984ch = JSONLexer.EOI;
                }
                this.matchStat = 4;
                return j10;
            }
            j10 = (j10 ^ ((cCharAt < 'A' || cCharAt > 'Z') ? cCharAt : cCharAt + ' ')) * 1099511628211L;
            if (cCharAt == '\\') {
                this.matchStat = -1;
                return 0L;
            }
            i10 = i11;
        }
    }

    public final void scanFalse() {
        if (this.f3984ch != 'f') {
            throw new JSONException("error parse false");
        }
        next();
        if (this.f3984ch != 'a') {
            throw new JSONException("error parse false");
        }
        next();
        if (this.f3984ch != 'l') {
            throw new JSONException("error parse false");
        }
        next();
        if (this.f3984ch != 's') {
            throw new JSONException("error parse false");
        }
        next();
        if (this.f3984ch != 'e') {
            throw new JSONException("error parse false");
        }
        next();
        char c10 = this.f3984ch;
        if (c10 != ' ' && c10 != ',' && c10 != '}' && c10 != ']' && c10 != '\n' && c10 != '\r' && c10 != '\t' && c10 != 26 && c10 != '\f' && c10 != '\b' && c10 != ':' && c10 != '/') {
            throw new JSONException("scan false error");
        }
        this.token = 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r2 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.math.BigInteger scanFieldBigInteger(char[] r22) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanFieldBigInteger(char[]):java.math.BigInteger");
    }

    public boolean scanFieldBoolean(char[] cArr) {
        int i10;
        boolean z10;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return false;
        }
        int length = cArr.length;
        int i11 = length + 1;
        char cCharAt = charAt(this.f3983bp + length);
        if (cCharAt == 't') {
            int i12 = length + 2;
            if (charAt(this.f3983bp + i11) != 'r') {
                this.matchStat = -1;
                return false;
            }
            int i13 = length + 3;
            if (charAt(this.f3983bp + i12) != 'u') {
                this.matchStat = -1;
                return false;
            }
            i10 = length + 4;
            if (charAt(this.f3983bp + i13) != 'e') {
                this.matchStat = -1;
                return false;
            }
            z10 = true;
        } else {
            if (cCharAt != 'f') {
                this.matchStat = -1;
                return false;
            }
            int i14 = length + 2;
            if (charAt(this.f3983bp + i11) != 'a') {
                this.matchStat = -1;
                return false;
            }
            int i15 = length + 3;
            if (charAt(this.f3983bp + i14) != 'l') {
                this.matchStat = -1;
                return false;
            }
            int i16 = length + 4;
            if (charAt(this.f3983bp + i15) != 's') {
                this.matchStat = -1;
                return false;
            }
            i10 = length + 5;
            if (charAt(this.f3983bp + i16) != 'e') {
                this.matchStat = -1;
                return false;
            }
            z10 = false;
        }
        int i17 = i10 + 1;
        char cCharAt2 = charAt(this.f3983bp + i10);
        if (cCharAt2 == ',') {
            int i18 = this.f3983bp + i17;
            this.f3983bp = i18;
            this.f3984ch = charAt(i18);
            this.matchStat = 3;
            this.token = 16;
            return z10;
        }
        if (cCharAt2 != '}') {
            this.matchStat = -1;
            return false;
        }
        int i19 = i10 + 2;
        char cCharAt3 = charAt(this.f3983bp + i17);
        if (cCharAt3 == ',') {
            this.token = 16;
            int i20 = this.f3983bp + i19;
            this.f3983bp = i20;
            this.f3984ch = charAt(i20);
        } else if (cCharAt3 == ']') {
            this.token = 15;
            int i21 = this.f3983bp + i19;
            this.f3983bp = i21;
            this.f3984ch = charAt(i21);
        } else if (cCharAt3 == '}') {
            this.token = 13;
            int i22 = this.f3983bp + i19;
            this.f3983bp = i22;
            this.f3984ch = charAt(i22);
        } else {
            if (cCharAt3 != 26) {
                this.matchStat = -1;
                return false;
            }
            this.token = 20;
            this.f3983bp += i10 + 1;
            this.f3984ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return z10;
    }

    public Date scanFieldDate(char[] cArr) {
        char cCharAt;
        int i10;
        long j10;
        Date date;
        int i11;
        char cCharAt2;
        boolean z10 = false;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = cArr.length;
        int i12 = length + 1;
        char cCharAt3 = charAt(this.f3983bp + length);
        if (cCharAt3 == '\"') {
            int iIndexOf = indexOf('\"', this.f3983bp + cArr.length + 1);
            if (iIndexOf == -1) {
                throw new JSONException("unclosed str");
            }
            int length2 = this.f3983bp + cArr.length + 1;
            String strSubString = subString(length2, iIndexOf - length2);
            if (strSubString.indexOf(92) != -1) {
                while (true) {
                    int i13 = 0;
                    for (int i14 = iIndexOf - 1; i14 >= 0 && charAt(i14) == '\\'; i14--) {
                        i13++;
                    }
                    if (i13 % 2 == 0) {
                        break;
                    }
                    iIndexOf = indexOf('\"', iIndexOf + 1);
                }
                int i15 = this.f3983bp;
                int length3 = iIndexOf - ((cArr.length + i15) + 1);
                strSubString = readString(sub_chars(i15 + cArr.length + 1, length3), length3);
            }
            int i16 = this.f3983bp;
            int length4 = i12 + (iIndexOf - ((cArr.length + i16) + 1)) + 1;
            i10 = length4 + 1;
            cCharAt = charAt(i16 + length4);
            JSONScanner jSONScanner = new JSONScanner(strSubString);
            try {
                if (!jSONScanner.scanISO8601DateIfMatch(false)) {
                    this.matchStat = -1;
                    return null;
                }
                date = jSONScanner.getCalendar().getTime();
            } finally {
                jSONScanner.close();
            }
        } else {
            if (cCharAt3 != '-' && (cCharAt3 < '0' || cCharAt3 > '9')) {
                this.matchStat = -1;
                return null;
            }
            if (cCharAt3 == '-') {
                cCharAt3 = charAt(this.f3983bp + i12);
                i12 = length + 2;
                z10 = true;
            }
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                cCharAt = cCharAt3;
                i10 = i12;
                j10 = 0;
            } else {
                j10 = cCharAt3 - '0';
                while (true) {
                    i11 = i12 + 1;
                    cCharAt2 = charAt(this.f3983bp + i12);
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    j10 = (j10 * 10) + (cCharAt2 - '0');
                    i12 = i11;
                }
                cCharAt = cCharAt2;
                i10 = i11;
            }
            if (j10 < 0) {
                this.matchStat = -1;
                return null;
            }
            if (z10) {
                j10 = -j10;
            }
            date = new Date(j10);
        }
        if (cCharAt == ',') {
            int i17 = this.f3983bp + i10;
            this.f3983bp = i17;
            this.f3984ch = charAt(i17);
            this.matchStat = 3;
            return date;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return null;
        }
        int i18 = i10 + 1;
        char cCharAt4 = charAt(this.f3983bp + i10);
        if (cCharAt4 == ',') {
            this.token = 16;
            int i19 = this.f3983bp + i18;
            this.f3983bp = i19;
            this.f3984ch = charAt(i19);
        } else if (cCharAt4 == ']') {
            this.token = 15;
            int i20 = this.f3983bp + i18;
            this.f3983bp = i20;
            this.f3984ch = charAt(i20);
        } else if (cCharAt4 == '}') {
            this.token = 13;
            int i21 = this.f3983bp + i18;
            this.f3983bp = i21;
            this.f3984ch = charAt(i21);
        } else {
            if (cCharAt4 != 26) {
                this.matchStat = -1;
                return null;
            }
            this.token = 20;
            this.f3983bp += i10;
            this.f3984ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return date;
    }

    public BigDecimal scanFieldDecimal(char[] cArr) {
        int i10;
        char cCharAt;
        int length;
        int i11;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length2 = cArr.length;
        int i12 = length2 + 1;
        char cCharAt2 = charAt(this.f3983bp + length2);
        boolean z10 = cCharAt2 == '\"';
        if (z10) {
            cCharAt2 = charAt(this.f3983bp + i12);
            i12 = length2 + 2;
        }
        if (cCharAt2 == '-') {
            cCharAt2 = charAt(this.f3983bp + i12);
            i12++;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            if (cCharAt2 != 'n' || charAt(this.f3983bp + i12) != 'u' || charAt(this.f3983bp + i12 + 1) != 'l' || charAt(this.f3983bp + i12 + 2) != 'l') {
                this.matchStat = -1;
                return null;
            }
            this.matchStat = 5;
            int i13 = i12 + 4;
            char cCharAt3 = charAt(this.f3983bp + i12 + 3);
            if (z10 && cCharAt3 == '\"') {
                cCharAt3 = charAt(this.f3983bp + i13);
                i13 = i12 + 5;
            }
            while (cCharAt3 != ',') {
                if (cCharAt3 == '}') {
                    int i14 = this.f3983bp + i13;
                    this.f3983bp = i14;
                    this.f3984ch = charAt(i14);
                    this.matchStat = 5;
                    this.token = 13;
                    return null;
                }
                if (!isWhitespace(cCharAt3)) {
                    this.matchStat = -1;
                    return null;
                }
                cCharAt3 = charAt(this.f3983bp + i13);
                i13++;
            }
            int i15 = this.f3983bp + i13;
            this.f3983bp = i15;
            this.f3984ch = charAt(i15);
            this.matchStat = 5;
            this.token = 16;
            return null;
        }
        while (true) {
            i10 = i12 + 1;
            cCharAt = charAt(this.f3983bp + i12);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i12 = i10;
        }
        if (cCharAt == '.') {
            int i16 = i12 + 2;
            char cCharAt4 = charAt(this.f3983bp + i10);
            if (cCharAt4 < '0' || cCharAt4 > '9') {
                this.matchStat = -1;
                return null;
            }
            while (true) {
                i10 = i16 + 1;
                cCharAt = charAt(this.f3983bp + i16);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i16 = i10;
            }
        }
        if (cCharAt == 'e' || cCharAt == 'E') {
            int i17 = i10 + 1;
            cCharAt = charAt(this.f3983bp + i10);
            if (cCharAt == '+' || cCharAt == '-') {
                i10 += 2;
                cCharAt = charAt(this.f3983bp + i17);
            } else {
                i10 = i17;
            }
            while (cCharAt >= '0' && cCharAt <= '9') {
                char cCharAt5 = charAt(this.f3983bp + i10);
                i10++;
                cCharAt = cCharAt5;
            }
        }
        if (!z10) {
            int i18 = this.f3983bp;
            length = cArr.length + i18;
            i11 = ((i18 + i10) - length) - 1;
        } else {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return null;
            }
            int i19 = i10 + 1;
            cCharAt = charAt(this.f3983bp + i10);
            int i20 = this.f3983bp;
            length = cArr.length + i20 + 1;
            i11 = ((i20 + i19) - length) - 2;
            i10 = i19;
        }
        if (i11 > 65535) {
            throw new JSONException("scan decimal overflow");
        }
        char[] cArrSub_chars = sub_chars(length, i11);
        BigDecimal bigDecimal = new BigDecimal(cArrSub_chars, 0, cArrSub_chars.length, MathContext.UNLIMITED);
        if (cCharAt == ',') {
            int i21 = this.f3983bp + i10;
            this.f3983bp = i21;
            this.f3984ch = charAt(i21);
            this.matchStat = 3;
            this.token = 16;
            return bigDecimal;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return null;
        }
        int i22 = i10 + 1;
        char cCharAt6 = charAt(this.f3983bp + i10);
        if (cCharAt6 == ',') {
            this.token = 16;
            int i23 = this.f3983bp + i22;
            this.f3983bp = i23;
            this.f3984ch = charAt(i23);
        } else if (cCharAt6 == ']') {
            this.token = 15;
            int i24 = this.f3983bp + i22;
            this.f3983bp = i24;
            this.f3984ch = charAt(i24);
        } else if (cCharAt6 == '}') {
            this.token = 13;
            int i25 = this.f3983bp + i22;
            this.f3983bp = i25;
            this.f3984ch = charAt(i25);
        } else {
            if (cCharAt6 != 26) {
                this.matchStat = -1;
                return null;
            }
            this.token = 20;
            this.f3983bp += i10;
            this.f3984ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return bigDecimal;
    }

    public final double scanFieldDouble(char[] cArr) throws NumberFormatException {
        int i10;
        char cCharAt;
        long j10;
        int length;
        int i11;
        double d10;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        int length2 = cArr.length;
        int i12 = length2 + 1;
        char cCharAt2 = charAt(this.f3983bp + length2);
        boolean z10 = cCharAt2 == '\"';
        if (z10) {
            cCharAt2 = charAt(this.f3983bp + i12);
            i12 = length2 + 2;
        }
        boolean z11 = cCharAt2 == '-';
        if (z11) {
            cCharAt2 = charAt(this.f3983bp + i12);
            i12++;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            boolean z12 = z10;
            if (cCharAt2 != 'n' || charAt(this.f3983bp + i12) != 'u' || charAt(this.f3983bp + i12 + 1) != 'l' || charAt(this.f3983bp + i12 + 2) != 'l') {
                this.matchStat = -1;
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            this.matchStat = 5;
            int i13 = i12 + 4;
            char cCharAt3 = charAt(this.f3983bp + i12 + 3);
            if (z12 && cCharAt3 == '\"') {
                int i14 = i12 + 5;
                cCharAt3 = charAt(this.f3983bp + i13);
                i13 = i14;
            }
            while (cCharAt3 != ',') {
                if (cCharAt3 == '}') {
                    int i15 = this.f3983bp + i13;
                    this.f3983bp = i15;
                    this.f3984ch = charAt(i15);
                    this.matchStat = 5;
                    this.token = 13;
                    return AudioStats.AUDIO_AMPLITUDE_NONE;
                }
                if (!isWhitespace(cCharAt3)) {
                    this.matchStat = -1;
                    return AudioStats.AUDIO_AMPLITUDE_NONE;
                }
                int i16 = i13 + 1;
                cCharAt3 = charAt(this.f3983bp + i13);
                i13 = i16;
            }
            int i17 = this.f3983bp + i13;
            this.f3983bp = i17;
            this.f3984ch = charAt(i17);
            this.matchStat = 5;
            this.token = 16;
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        boolean z13 = z10;
        long j11 = cCharAt2 - '0';
        while (true) {
            i10 = i12 + 1;
            cCharAt = charAt(this.f3983bp + i12);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j11 = (j11 * 10) + (cCharAt - '0');
            i12 = i10;
        }
        if (cCharAt == '.') {
            int i18 = i12 + 2;
            char cCharAt4 = charAt(this.f3983bp + i10);
            if (cCharAt4 < '0' || cCharAt4 > '9') {
                this.matchStat = -1;
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            j11 = (j11 * 10) + (cCharAt4 - '0');
            j10 = 10;
            while (true) {
                i10 = i18 + 1;
                cCharAt = charAt(this.f3983bp + i18);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                j11 = (j11 * 10) + (cCharAt - '0');
                j10 *= 10;
                i18 = i10;
            }
        } else {
            j10 = 1;
        }
        boolean z14 = cCharAt == 'e' || cCharAt == 'E';
        if (z14) {
            int i19 = i10 + 1;
            cCharAt = charAt(this.f3983bp + i10);
            if (cCharAt == '+' || cCharAt == '-') {
                i10 += 2;
                cCharAt = charAt(this.f3983bp + i19);
            } else {
                i10 = i19;
            }
            while (cCharAt >= '0' && cCharAt <= '9') {
                char cCharAt5 = charAt(this.f3983bp + i10);
                i10++;
                cCharAt = cCharAt5;
            }
        }
        if (!z13) {
            int i20 = this.f3983bp;
            length = cArr.length + i20;
            i11 = ((i20 + i10) - length) - 1;
        } else {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            int i21 = i10 + 1;
            cCharAt = charAt(this.f3983bp + i10);
            int i22 = this.f3983bp;
            length = cArr.length + i22 + 1;
            i11 = ((i22 + i21) - length) - 2;
            i10 = i21;
        }
        if (z14 || i11 >= 17) {
            d10 = Double.parseDouble(subString(length, i11));
        } else {
            d10 = j11 / j10;
            if (z11) {
                d10 = -d10;
            }
        }
        if (cCharAt == ',') {
            int i23 = this.f3983bp + i10;
            this.f3983bp = i23;
            this.f3984ch = charAt(i23);
            this.matchStat = 3;
            this.token = 16;
            return d10;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        int i24 = i10 + 1;
        char cCharAt6 = charAt(this.f3983bp + i10);
        if (cCharAt6 == ',') {
            this.token = 16;
            int i25 = this.f3983bp + i24;
            this.f3983bp = i25;
            this.f3984ch = charAt(i25);
        } else if (cCharAt6 == ']') {
            this.token = 15;
            int i26 = this.f3983bp + i24;
            this.f3983bp = i26;
            this.f3984ch = charAt(i26);
        } else if (cCharAt6 == '}') {
            this.token = 13;
            int i27 = this.f3983bp + i24;
            this.f3983bp = i27;
            this.f3984ch = charAt(i27);
        } else {
            if (cCharAt6 != 26) {
                this.matchStat = -1;
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            this.token = 20;
            this.f3983bp += i10;
            this.f3984ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return d10;
    }

    public final float scanFieldFloat(char[] cArr) throws NumberFormatException {
        int i10;
        char cCharAt;
        long j10;
        int length;
        int i11;
        float f10;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0.0f;
        }
        int length2 = cArr.length;
        int i12 = length2 + 1;
        char cCharAt2 = charAt(this.f3983bp + length2);
        boolean z10 = cCharAt2 == '\"';
        if (z10) {
            cCharAt2 = charAt(this.f3983bp + i12);
            i12 = length2 + 2;
        }
        boolean z11 = cCharAt2 == '-';
        if (z11) {
            cCharAt2 = charAt(this.f3983bp + i12);
            i12++;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            boolean z12 = z10;
            if (cCharAt2 != 'n' || charAt(this.f3983bp + i12) != 'u' || charAt(this.f3983bp + i12 + 1) != 'l' || charAt(this.f3983bp + i12 + 2) != 'l') {
                this.matchStat = -1;
                return 0.0f;
            }
            this.matchStat = 5;
            int i13 = i12 + 4;
            char cCharAt3 = charAt(this.f3983bp + i12 + 3);
            if (z12 && cCharAt3 == '\"') {
                int i14 = i12 + 5;
                cCharAt3 = charAt(this.f3983bp + i13);
                i13 = i14;
            }
            while (cCharAt3 != ',') {
                if (cCharAt3 == '}') {
                    int i15 = this.f3983bp + i13;
                    this.f3983bp = i15;
                    this.f3984ch = charAt(i15);
                    this.matchStat = 5;
                    this.token = 13;
                    return 0.0f;
                }
                if (!isWhitespace(cCharAt3)) {
                    this.matchStat = -1;
                    return 0.0f;
                }
                int i16 = i13 + 1;
                cCharAt3 = charAt(this.f3983bp + i13);
                i13 = i16;
            }
            int i17 = this.f3983bp + i13;
            this.f3983bp = i17;
            this.f3984ch = charAt(i17);
            this.matchStat = 5;
            this.token = 16;
            return 0.0f;
        }
        boolean z13 = z10;
        long j11 = cCharAt2 - '0';
        while (true) {
            i10 = i12 + 1;
            cCharAt = charAt(this.f3983bp + i12);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j11 = (j11 * 10) + (cCharAt - '0');
            i12 = i10;
        }
        if (cCharAt == '.') {
            int i18 = i12 + 2;
            char cCharAt4 = charAt(this.f3983bp + i10);
            if (cCharAt4 < '0' || cCharAt4 > '9') {
                this.matchStat = -1;
                return 0.0f;
            }
            j11 = (j11 * 10) + (cCharAt4 - '0');
            j10 = 10;
            while (true) {
                i10 = i18 + 1;
                cCharAt = charAt(this.f3983bp + i18);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                j11 = (j11 * 10) + (cCharAt - '0');
                j10 *= 10;
                i18 = i10;
            }
        } else {
            j10 = 1;
        }
        boolean z14 = cCharAt == 'e' || cCharAt == 'E';
        if (z14) {
            int i19 = i10 + 1;
            cCharAt = charAt(this.f3983bp + i10);
            if (cCharAt == '+' || cCharAt == '-') {
                i10 += 2;
                cCharAt = charAt(this.f3983bp + i19);
            } else {
                i10 = i19;
            }
            while (cCharAt >= '0' && cCharAt <= '9') {
                char cCharAt5 = charAt(this.f3983bp + i10);
                i10++;
                cCharAt = cCharAt5;
            }
        }
        if (!z13) {
            int i20 = this.f3983bp;
            length = cArr.length + i20;
            i11 = ((i20 + i10) - length) - 1;
        } else {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return 0.0f;
            }
            int i21 = i10 + 1;
            cCharAt = charAt(this.f3983bp + i10);
            int i22 = this.f3983bp;
            length = cArr.length + i22 + 1;
            i11 = ((i22 + i21) - length) - 2;
            i10 = i21;
        }
        if (z14 || i11 >= 17) {
            f10 = Float.parseFloat(subString(length, i11));
        } else {
            f10 = (float) (j11 / j10);
            if (z11) {
                f10 = -f10;
            }
        }
        if (cCharAt == ',') {
            int i23 = this.f3983bp + i10;
            this.f3983bp = i23;
            this.f3984ch = charAt(i23);
            this.matchStat = 3;
            this.token = 16;
            return f10;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return 0.0f;
        }
        int i24 = i10 + 1;
        char cCharAt6 = charAt(this.f3983bp + i10);
        if (cCharAt6 == ',') {
            this.token = 16;
            int i25 = this.f3983bp + i24;
            this.f3983bp = i25;
            this.f3984ch = charAt(i25);
        } else if (cCharAt6 == ']') {
            this.token = 15;
            int i26 = this.f3983bp + i24;
            this.f3983bp = i26;
            this.f3984ch = charAt(i26);
        } else if (cCharAt6 == '}') {
            this.token = 13;
            int i27 = this.f3983bp + i24;
            this.f3983bp = i27;
            this.f3984ch = charAt(i27);
        } else {
            if (cCharAt6 != 26) {
                this.matchStat = -1;
                return 0.0f;
            }
            this.f3983bp += i10;
            this.token = 20;
            this.f3984ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        r20.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01af, code lost:
    
        r17 = r4;
        r20.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b4, code lost:
    
        return r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[] scanFieldFloatArray(char[] r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanFieldFloatArray(char[]):float[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
    
        r22.matchStat = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0134, code lost:
    
        r5 = r20 + 1;
        r2 = charAt(r22.f3983bp + r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013f, code lost:
    
        if (r4 == r3.length) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0141, code lost:
    
        r7 = new float[r4];
        java.lang.System.arraycopy(r3, 0, r7, 0, r4);
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0148, code lost:
    
        if (r8 < r6.length) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014a, code lost:
    
        r6 = new float[(r6.length * 3) / 2][];
        java.lang.System.arraycopy(r3, 0, r6, 0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0154, code lost:
    
        r4 = r8 + 1;
        r6[r8] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015a, code lost:
    
        if (r2 != ',') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015c, code lost:
    
        r3 = charAt(r22.f3983bp + r5);
        r2 = r20 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016b, code lost:
    
        if (r2 != ']') goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016d, code lost:
    
        r3 = charAt(r22.f3983bp + r5);
        r2 = r20 + 2;
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017b, code lost:
    
        r3 = r2;
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0193, code lost:
    
        r22.matchStat = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0196, code lost:
    
        return r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[][] scanFieldFloatArray2(char[] r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanFieldFloatArray2(char[]):float[][]");
    }

    public int scanFieldInt(char[] cArr) {
        int i10;
        char cCharAt;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0;
        }
        int length = cArr.length;
        int i11 = length + 1;
        char cCharAt2 = charAt(this.f3983bp + length);
        boolean z10 = cCharAt2 == '-';
        if (z10) {
            cCharAt2 = charAt(this.f3983bp + i11);
            i11 = length + 2;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.matchStat = -1;
            return 0;
        }
        int i12 = cCharAt2 - '0';
        while (true) {
            i10 = i11 + 1;
            cCharAt = charAt(this.f3983bp + i11);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i12 = (i12 * 10) + (cCharAt - '0');
            i11 = i10;
        }
        if (cCharAt == '.') {
            this.matchStat = -1;
            return 0;
        }
        if ((i12 < 0 || i10 > cArr.length + 14) && !(i12 == Integer.MIN_VALUE && i10 == 17 && z10)) {
            this.matchStat = -1;
            return 0;
        }
        if (cCharAt == ',') {
            int i13 = this.f3983bp + i10;
            this.f3983bp = i13;
            this.f3984ch = charAt(i13);
            this.matchStat = 3;
            this.token = 16;
            if (z10) {
                return -i12;
            }
        } else {
            if (cCharAt != '}') {
                this.matchStat = -1;
                return 0;
            }
            int i14 = i11 + 2;
            char cCharAt3 = charAt(this.f3983bp + i10);
            if (cCharAt3 == ',') {
                this.token = 16;
                int i15 = this.f3983bp + i14;
                this.f3983bp = i15;
                this.f3984ch = charAt(i15);
            } else if (cCharAt3 == ']') {
                this.token = 15;
                int i16 = this.f3983bp + i14;
                this.f3983bp = i16;
                this.f3984ch = charAt(i16);
            } else if (cCharAt3 == '}') {
                this.token = 13;
                int i17 = this.f3983bp + i14;
                this.f3983bp = i17;
                this.f3984ch = charAt(i17);
            } else {
                if (cCharAt3 != 26) {
                    this.matchStat = -1;
                    return 0;
                }
                this.token = 20;
                this.f3983bp += i11 + 1;
                this.f3984ch = JSONLexer.EOI;
            }
            this.matchStat = 4;
            if (z10) {
                return -i12;
            }
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        r16 = r4;
        r19.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
    
        return r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] scanFieldIntArray(char[] r20) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanFieldIntArray(char[]):int[]");
    }

    public long scanFieldLong(char[] cArr) {
        int i10;
        char cCharAt;
        boolean z10 = false;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0L;
        }
        int length = cArr.length;
        int i11 = length + 1;
        char cCharAt2 = charAt(this.f3983bp + length);
        if (cCharAt2 == '-') {
            cCharAt2 = charAt(this.f3983bp + i11);
            i11 = length + 2;
            z10 = true;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.matchStat = -1;
            return 0L;
        }
        long j10 = cCharAt2 - '0';
        while (true) {
            i10 = i11 + 1;
            cCharAt = charAt(this.f3983bp + i11);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j10 = (j10 * 10) + (cCharAt - '0');
            i11 = i10;
        }
        if (cCharAt == '.') {
            this.matchStat = -1;
            return 0L;
        }
        if (i10 - cArr.length >= 21 || (j10 < 0 && !(j10 == Long.MIN_VALUE && z10))) {
            this.matchStat = -1;
            return 0L;
        }
        if (cCharAt == ',') {
            int i12 = this.f3983bp + i10;
            this.f3983bp = i12;
            this.f3984ch = charAt(i12);
            this.matchStat = 3;
            this.token = 16;
            if (z10) {
                return -j10;
            }
        } else {
            if (cCharAt != '}') {
                this.matchStat = -1;
                return 0L;
            }
            int i13 = i11 + 2;
            char cCharAt3 = charAt(this.f3983bp + i10);
            if (cCharAt3 == ',') {
                this.token = 16;
                int i14 = this.f3983bp + i13;
                this.f3983bp = i14;
                this.f3984ch = charAt(i14);
            } else if (cCharAt3 == ']') {
                this.token = 15;
                int i15 = this.f3983bp + i13;
                this.f3983bp = i15;
                this.f3984ch = charAt(i15);
            } else if (cCharAt3 == '}') {
                this.token = 13;
                int i16 = this.f3983bp + i13;
                this.f3983bp = i16;
                this.f3984ch = charAt(i16);
            } else {
                if (cCharAt3 != 26) {
                    this.matchStat = -1;
                    return 0L;
                }
                this.token = 20;
                this.f3983bp += i11 + 1;
                this.f3984ch = JSONLexer.EOI;
            }
            this.matchStat = 4;
            if (z10) {
                return -j10;
            }
        }
        return j10;
    }

    public String scanFieldString(char[] cArr) {
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return stringDefaultValue();
        }
        int length = cArr.length;
        int i10 = length + 1;
        if (charAt(this.f3983bp + length) != '\"') {
            this.matchStat = -1;
            return stringDefaultValue();
        }
        int iIndexOf = indexOf('\"', this.f3983bp + cArr.length + 1);
        if (iIndexOf == -1) {
            throw new JSONException("unclosed str");
        }
        int length2 = this.f3983bp + cArr.length + 1;
        String strSubString = subString(length2, iIndexOf - length2);
        if (strSubString.indexOf(92) != -1) {
            while (true) {
                int i11 = 0;
                for (int i12 = iIndexOf - 1; i12 >= 0 && charAt(i12) == '\\'; i12--) {
                    i11++;
                }
                if (i11 % 2 == 0) {
                    break;
                }
                iIndexOf = indexOf('\"', iIndexOf + 1);
            }
            int i13 = this.f3983bp;
            int length3 = iIndexOf - ((cArr.length + i13) + 1);
            strSubString = readString(sub_chars(i13 + cArr.length + 1, length3), length3);
        }
        int i14 = this.f3983bp;
        int length4 = i10 + (iIndexOf - ((cArr.length + i14) + 1)) + 1;
        int i15 = length4 + 1;
        char cCharAt = charAt(i14 + length4);
        if (cCharAt == ',') {
            int i16 = this.f3983bp + i15;
            this.f3983bp = i16;
            this.f3984ch = charAt(i16);
            this.matchStat = 3;
            return strSubString;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return stringDefaultValue();
        }
        int i17 = length4 + 2;
        char cCharAt2 = charAt(this.f3983bp + i15);
        if (cCharAt2 == ',') {
            this.token = 16;
            int i18 = this.f3983bp + i17;
            this.f3983bp = i18;
            this.f3984ch = charAt(i18);
        } else if (cCharAt2 == ']') {
            this.token = 15;
            int i19 = this.f3983bp + i17;
            this.f3983bp = i19;
            this.f3984ch = charAt(i19);
        } else if (cCharAt2 == '}') {
            this.token = 13;
            int i20 = this.f3983bp + i17;
            this.f3983bp = i20;
            this.f3984ch = charAt(i20);
        } else {
            if (cCharAt2 != 26) {
                this.matchStat = -1;
                return stringDefaultValue();
            }
            this.token = 20;
            this.f3983bp += length4 + 1;
            this.f3984ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return strSubString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        if (r1 != ']') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f0, code lost:
    
        if (r14.size() != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
    
        r1 = r13 + 1;
        r13 = charAt(r12.f3983bp + r13);
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0170, code lost:
    
        throw new com.alibaba.fastjson.JSONException("illega str");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection<java.lang.String> scanFieldStringArray(char[] r13, java.lang.Class<?> r14) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanFieldStringArray(char[], java.lang.Class):java.util.Collection");
    }

    public long scanFieldSymbol(char[] cArr) {
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0L;
        }
        int length = cArr.length;
        int i10 = length + 1;
        if (charAt(this.f3983bp + length) != '\"') {
            this.matchStat = -1;
            return 0L;
        }
        long j10 = -3750763034362895579L;
        while (true) {
            int i11 = i10 + 1;
            char cCharAt = charAt(this.f3983bp + i10);
            if (cCharAt == '\"') {
                int i12 = i10 + 2;
                char cCharAt2 = charAt(this.f3983bp + i11);
                if (cCharAt2 == ',') {
                    int i13 = this.f3983bp + i12;
                    this.f3983bp = i13;
                    this.f3984ch = charAt(i13);
                    this.matchStat = 3;
                    return j10;
                }
                if (cCharAt2 != '}') {
                    this.matchStat = -1;
                    return 0L;
                }
                int i14 = i10 + 3;
                char cCharAt3 = charAt(this.f3983bp + i12);
                if (cCharAt3 == ',') {
                    this.token = 16;
                    int i15 = this.f3983bp + i14;
                    this.f3983bp = i15;
                    this.f3984ch = charAt(i15);
                } else if (cCharAt3 == ']') {
                    this.token = 15;
                    int i16 = this.f3983bp + i14;
                    this.f3983bp = i16;
                    this.f3984ch = charAt(i16);
                } else if (cCharAt3 == '}') {
                    this.token = 13;
                    int i17 = this.f3983bp + i14;
                    this.f3983bp = i17;
                    this.f3984ch = charAt(i17);
                } else {
                    if (cCharAt3 != 26) {
                        this.matchStat = -1;
                        return 0L;
                    }
                    this.token = 20;
                    this.f3983bp += i10 + 2;
                    this.f3984ch = JSONLexer.EOI;
                }
                this.matchStat = 4;
                return j10;
            }
            j10 = (j10 ^ cCharAt) * 1099511628211L;
            if (cCharAt == '\\') {
                this.matchStat = -1;
                return 0L;
            }
            i10 = i11;
        }
    }

    public UUID scanFieldUUID(char[] cArr) {
        UUID uuid;
        int i10;
        char cCharAt;
        int i11;
        UUID uuid2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = cArr.length;
        int i19 = length + 1;
        char cCharAt2 = charAt(this.f3983bp + length);
        if (cCharAt2 != '\"') {
            uuid = null;
            i10 = 4;
            if (cCharAt2 == 'n') {
                int i20 = length + 2;
                if (charAt(this.f3983bp + i19) == 'u') {
                    int i21 = length + 3;
                    if (charAt(this.f3983bp + i20) == 'l') {
                        int i22 = length + 4;
                        if (charAt(this.f3983bp + i21) == 'l') {
                            int i23 = length + 5;
                            cCharAt = charAt(this.f3983bp + i22);
                            i11 = i23;
                            uuid2 = null;
                        }
                    }
                }
            }
            this.matchStat = -1;
            return null;
        }
        int iIndexOf = indexOf('\"', this.f3983bp + cArr.length + 1);
        if (iIndexOf == -1) {
            throw new JSONException("unclosed str");
        }
        int length2 = this.f3983bp + cArr.length + 1;
        int i24 = iIndexOf - length2;
        char c10 = 'F';
        uuid = null;
        char c11 = 'A';
        char c12 = 'f';
        char c13 = 'a';
        i10 = 4;
        if (i24 == 36) {
            int i25 = 0;
            long j10 = 0;
            while (i25 < 8) {
                char cCharAt3 = charAt(length2 + i25);
                if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                    i18 = cCharAt3 - '0';
                } else if (cCharAt3 >= 'a' && cCharAt3 <= 'f') {
                    i18 = cCharAt3 - 'W';
                } else {
                    if (cCharAt3 < 'A' || cCharAt3 > c10) {
                        this.matchStat = -2;
                        return null;
                    }
                    i18 = cCharAt3 - '7';
                }
                j10 = (j10 << 4) | i18;
                i25++;
                iIndexOf = iIndexOf;
                c10 = 'F';
            }
            int i26 = iIndexOf;
            int i27 = 9;
            for (int i28 = 13; i27 < i28; i28 = 13) {
                char cCharAt4 = charAt(length2 + i27);
                if (cCharAt4 >= '0' && cCharAt4 <= '9') {
                    i17 = cCharAt4 - '0';
                } else if (cCharAt4 >= 'a' && cCharAt4 <= 'f') {
                    i17 = cCharAt4 - 'W';
                } else {
                    if (cCharAt4 < 'A' || cCharAt4 > 'F') {
                        this.matchStat = -2;
                        return null;
                    }
                    i17 = cCharAt4 - '7';
                }
                j10 = (j10 << 4) | i17;
                i27++;
            }
            int i29 = 14;
            long j11 = j10;
            while (i29 < 18) {
                char cCharAt5 = charAt(length2 + i29);
                if (cCharAt5 >= '0' && cCharAt5 <= '9') {
                    i16 = cCharAt5 - '0';
                } else if (cCharAt5 >= 'a' && cCharAt5 <= 'f') {
                    i16 = cCharAt5 - 'W';
                } else {
                    if (cCharAt5 < c11 || cCharAt5 > 'F') {
                        this.matchStat = -2;
                        return null;
                    }
                    i16 = cCharAt5 - '7';
                }
                j11 = (j11 << 4) | i16;
                i29++;
                length2 = length2;
                c11 = 'A';
            }
            int i30 = length2;
            int i31 = 19;
            long j12 = 0;
            while (i31 < 23) {
                char cCharAt6 = charAt(i30 + i31);
                if (cCharAt6 >= '0' && cCharAt6 <= '9') {
                    i15 = cCharAt6 - '0';
                } else if (cCharAt6 >= c13 && cCharAt6 <= c12) {
                    i15 = cCharAt6 - 'W';
                } else {
                    if (cCharAt6 < 'A' || cCharAt6 > 'F') {
                        this.matchStat = -2;
                        return null;
                    }
                    i15 = cCharAt6 - '7';
                }
                j12 = (j12 << 4) | i15;
                i31++;
                c12 = 'f';
                c13 = 'a';
            }
            long j13 = j12;
            for (int i32 = 24; i32 < 36; i32++) {
                char cCharAt7 = charAt(i30 + i32);
                if (cCharAt7 >= '0' && cCharAt7 <= '9') {
                    i14 = cCharAt7 - '0';
                } else if (cCharAt7 >= 'a' && cCharAt7 <= 'f') {
                    i14 = cCharAt7 - 'W';
                } else {
                    if (cCharAt7 < 'A' || cCharAt7 > 'F') {
                        this.matchStat = -2;
                        return null;
                    }
                    i14 = cCharAt7 - '7';
                }
                j13 = (j13 << 4) | i14;
            }
            uuid2 = new UUID(j11, j13);
            int i33 = this.f3983bp;
            int length3 = i19 + (i26 - ((cArr.length + i33) + 1)) + 1;
            i11 = length3 + 1;
            cCharAt = charAt(i33 + length3);
        } else {
            if (i24 != 32) {
                this.matchStat = -1;
                return null;
            }
            long j14 = 0;
            for (int i34 = 0; i34 < 16; i34++) {
                char cCharAt8 = charAt(length2 + i34);
                if (cCharAt8 >= '0' && cCharAt8 <= '9') {
                    i13 = cCharAt8 - '0';
                } else if (cCharAt8 >= 'a' && cCharAt8 <= 'f') {
                    i13 = cCharAt8 - 'W';
                } else {
                    if (cCharAt8 < 'A' || cCharAt8 > 'F') {
                        this.matchStat = -2;
                        return null;
                    }
                    i13 = cCharAt8 - '7';
                }
                j14 = (j14 << 4) | i13;
            }
            int i35 = 16;
            long j15 = 0;
            for (int i36 = 32; i35 < i36; i36 = 32) {
                char cCharAt9 = charAt(length2 + i35);
                if (cCharAt9 >= '0' && cCharAt9 <= '9') {
                    i12 = cCharAt9 - '0';
                } else if (cCharAt9 >= 'a' && cCharAt9 <= 'f') {
                    i12 = cCharAt9 - 'W';
                } else {
                    if (cCharAt9 < 'A' || cCharAt9 > 'F') {
                        this.matchStat = -2;
                        return null;
                    }
                    i12 = cCharAt9 - '7';
                }
                j15 = (j15 << 4) | i12;
                i35++;
            }
            uuid2 = new UUID(j14, j15);
            int i37 = this.f3983bp;
            int length4 = i19 + (iIndexOf - ((cArr.length + i37) + 1)) + 1;
            i11 = length4 + 1;
            cCharAt = charAt(i37 + length4);
        }
        if (cCharAt == ',') {
            int i38 = this.f3983bp + i11;
            this.f3983bp = i38;
            this.f3984ch = charAt(i38);
            this.matchStat = 3;
            return uuid2;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return uuid;
        }
        int i39 = i11 + 1;
        char cCharAt10 = charAt(this.f3983bp + i11);
        if (cCharAt10 == ',') {
            this.token = 16;
            int i40 = this.f3983bp + i39;
            this.f3983bp = i40;
            this.f3984ch = charAt(i40);
        } else if (cCharAt10 == ']') {
            this.token = 15;
            int i41 = this.f3983bp + i39;
            this.f3983bp = i41;
            this.f3984ch = charAt(i41);
        } else if (cCharAt10 == '}') {
            this.token = 13;
            int i42 = this.f3983bp + i39;
            this.f3983bp = i42;
            this.f3984ch = charAt(i42);
        } else {
            if (cCharAt10 != 26) {
                this.matchStat = -1;
                return uuid;
            }
            this.token = 20;
            this.f3983bp += i11;
            this.f3984ch = JSONLexer.EOI;
        }
        this.matchStat = i10;
        return uuid2;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00c7 -> B:49:0x00b7). Please report as a decompilation issue!!! */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float scanFloat(char r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanFloat(char):float");
    }

    public final void scanHex() {
        char next;
        if (this.f3984ch != 'x') {
            throw new JSONException("illegal state. " + this.f3984ch);
        }
        next();
        if (this.f3984ch != '\'') {
            throw new JSONException("illegal state. " + this.f3984ch);
        }
        this.f3985np = this.f3983bp;
        next();
        if (this.f3984ch == '\'') {
            next();
            this.token = 26;
            return;
        }
        while (true) {
            next = next();
            if ((next < '0' || next > '9') && (next < 'A' || next > 'F')) {
                break;
            } else {
                this.f3986sp++;
            }
        }
        if (next == '\'') {
            this.f3986sp++;
            next();
            this.token = 26;
        } else {
            throw new JSONException("illegal state. " + next);
        }
    }

    public final void scanIdent() {
        this.f3985np = this.f3983bp - 1;
        this.hasSpecial = false;
        do {
            this.f3986sp++;
            next();
        } while (Character.isLetterOrDigit(this.f3984ch));
        String strStringVal = stringVal();
        if ("null".equalsIgnoreCase(strStringVal)) {
            this.token = 8;
            return;
        }
        if ("new".equals(strStringVal)) {
            this.token = 9;
            return;
        }
        if (RequestConstant.TRUE.equals(strStringVal)) {
            this.token = 6;
            return;
        }
        if (RequestConstant.FALSE.equals(strStringVal)) {
            this.token = 7;
            return;
        }
        if ("undefined".equals(strStringVal)) {
            this.token = 23;
            return;
        }
        if ("Set".equals(strStringVal)) {
            this.token = 21;
        } else if ("TreeSet".equals(strStringVal)) {
            this.token = 22;
        } else {
            this.token = 18;
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public int scanInt(char c10) {
        int i10;
        int i11;
        char cCharAt;
        this.matchStat = 0;
        char cCharAt2 = charAt(this.f3983bp);
        boolean z10 = cCharAt2 == '\"';
        if (z10) {
            cCharAt2 = charAt(this.f3983bp + 1);
            i10 = 2;
        } else {
            i10 = 1;
        }
        boolean z11 = cCharAt2 == '-';
        if (z11) {
            cCharAt2 = charAt(this.f3983bp + i10);
            i10++;
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            int i12 = cCharAt2 - '0';
            while (true) {
                i11 = i10 + 1;
                cCharAt = charAt(this.f3983bp + i10);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i12 = (i12 * 10) + (cCharAt - '0');
                i10 = i11;
            }
            if (cCharAt == '.') {
                this.matchStat = -1;
                return 0;
            }
            if (i12 < 0) {
                this.matchStat = -1;
                return 0;
            }
            while (true) {
                if (cCharAt == c10) {
                    int i13 = this.f3983bp + i11;
                    this.f3983bp = i13;
                    this.f3984ch = charAt(i13);
                    this.matchStat = 3;
                    this.token = 16;
                    if (z11) {
                        return -i12;
                    }
                } else if (isWhitespace(cCharAt)) {
                    char cCharAt3 = charAt(this.f3983bp + i11);
                    i11++;
                    cCharAt = cCharAt3;
                } else {
                    this.matchStat = -1;
                    if (z11) {
                        return -i12;
                    }
                }
            }
            return i12;
        }
        if (cCharAt2 != 'n' || charAt(this.f3983bp + i10) != 'u' || charAt(this.f3983bp + i10 + 1) != 'l' || charAt(this.f3983bp + i10 + 2) != 'l') {
            this.matchStat = -1;
            return 0;
        }
        this.matchStat = 5;
        int i14 = i10 + 4;
        char cCharAt4 = charAt(this.f3983bp + i10 + 3);
        if (z10 && cCharAt4 == '\"') {
            cCharAt4 = charAt(this.f3983bp + i14);
            i14 = i10 + 5;
        }
        while (cCharAt4 != ',') {
            if (cCharAt4 == ']') {
                int i15 = this.f3983bp + i14;
                this.f3983bp = i15;
                this.f3984ch = charAt(i15);
                this.matchStat = 5;
                this.token = 15;
                return 0;
            }
            if (!isWhitespace(cCharAt4)) {
                this.matchStat = -1;
                return 0;
            }
            cCharAt4 = charAt(this.f3983bp + i14);
            i14++;
        }
        int i16 = this.f3983bp + i14;
        this.f3983bp = i16;
        this.f3984ch = charAt(i16);
        this.matchStat = 5;
        this.token = 16;
        return 0;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public long scanLong(char c10) {
        int i10;
        int i11;
        char cCharAt;
        char c11;
        this.matchStat = 0;
        char cCharAt2 = charAt(this.f3983bp);
        boolean z10 = cCharAt2 == '\"';
        if (z10) {
            cCharAt2 = charAt(this.f3983bp + 1);
            i10 = 2;
        } else {
            i10 = 1;
        }
        boolean z11 = cCharAt2 == '-';
        if (z11) {
            cCharAt2 = charAt(this.f3983bp + i10);
            i10++;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            if (cCharAt2 != 'n' || charAt(this.f3983bp + i10) != 'u' || charAt(this.f3983bp + i10 + 1) != 'l' || charAt(this.f3983bp + i10 + 2) != 'l') {
                this.matchStat = -1;
                return 0L;
            }
            this.matchStat = 5;
            int i12 = i10 + 4;
            char cCharAt3 = charAt(this.f3983bp + i10 + 3);
            if (z10 && cCharAt3 == '\"') {
                cCharAt3 = charAt(this.f3983bp + i12);
                i12 = i10 + 5;
            }
            while (cCharAt3 != ',') {
                if (cCharAt3 == ']') {
                    int i13 = this.f3983bp + i12;
                    this.f3983bp = i13;
                    this.f3984ch = charAt(i13);
                    this.matchStat = 5;
                    this.token = 15;
                    return 0L;
                }
                if (!isWhitespace(cCharAt3)) {
                    this.matchStat = -1;
                    return 0L;
                }
                cCharAt3 = charAt(this.f3983bp + i12);
                i12++;
            }
            int i14 = this.f3983bp + i12;
            this.f3983bp = i14;
            this.f3984ch = charAt(i14);
            this.matchStat = 5;
            this.token = 16;
            return 0L;
        }
        long j10 = cCharAt2 - '0';
        while (true) {
            i11 = i10 + 1;
            cCharAt = charAt(this.f3983bp + i10);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j10 = (j10 * 10) + (cCharAt - '0');
            i10 = i11;
        }
        if (cCharAt == '.') {
            this.matchStat = -1;
            return 0L;
        }
        if (j10 < 0 && (j10 != Long.MIN_VALUE || !z11)) {
            throw new NumberFormatException(subString(this.f3983bp, i10));
        }
        if (!z10) {
            c11 = c10;
        } else {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return 0L;
            }
            cCharAt = charAt(this.f3983bp + i11);
            c11 = c10;
            i11 = i10 + 2;
        }
        while (cCharAt != c11) {
            if (!isWhitespace(cCharAt)) {
                this.matchStat = -1;
                return j10;
            }
            cCharAt = charAt(this.f3983bp + i11);
            i11++;
        }
        int i15 = this.f3983bp + i11;
        this.f3983bp = i15;
        this.f3984ch = charAt(i15);
        this.matchStat = 3;
        this.token = 16;
        return z11 ? -j10 : j10;
    }

    public final void scanNullOrNew() {
        scanNullOrNew(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void scanNumber() {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanNumber():void");
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void scanString() throws NumberFormatException {
        char next;
        char next2;
        this.f3985np = this.f3983bp;
        this.hasSpecial = false;
        while (true) {
            char next3 = next();
            if (next3 == '\"') {
                this.token = 4;
                this.f3984ch = next();
                return;
            }
            if (next3 != 26) {
                boolean z10 = true;
                if (next3 == '\\') {
                    if (!this.hasSpecial) {
                        this.hasSpecial = true;
                        int i10 = this.f3986sp;
                        char[] cArr = this.sbuf;
                        if (i10 >= cArr.length) {
                            int length = cArr.length * 2;
                            if (i10 <= length) {
                                i10 = length;
                            }
                            char[] cArr2 = new char[i10];
                            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                            this.sbuf = cArr2;
                        }
                        copyTo(this.f3985np + 1, this.f3986sp, this.sbuf);
                    }
                    char next4 = next();
                    if (next4 == '\"') {
                        putChar('\"');
                    } else if (next4 != '\'') {
                        if (next4 != 'F') {
                            if (next4 == '\\') {
                                putChar('\\');
                            } else if (next4 == 'b') {
                                putChar('\b');
                            } else if (next4 != 'f') {
                                if (next4 == 'n') {
                                    putChar('\n');
                                } else if (next4 == 'r') {
                                    putChar('\r');
                                } else if (next4 != 'x') {
                                    switch (next4) {
                                        case '/':
                                            putChar('/');
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                            putChar((char) 0);
                                            break;
                                        case '1':
                                            putChar((char) 1);
                                            break;
                                        case '2':
                                            putChar((char) 2);
                                            break;
                                        case '3':
                                            putChar((char) 3);
                                            break;
                                        case '4':
                                            putChar((char) 4);
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                            putChar((char) 5);
                                            break;
                                        case '6':
                                            putChar((char) 6);
                                            break;
                                        case '7':
                                            putChar((char) 7);
                                            break;
                                        default:
                                            switch (next4) {
                                                case 't':
                                                    putChar('\t');
                                                    break;
                                                case 'u':
                                                    putChar((char) Integer.parseInt(new String(new char[]{next(), next(), next(), next()}), 16));
                                                    break;
                                                case 'v':
                                                    putChar((char) 11);
                                                    break;
                                                default:
                                                    this.f3984ch = next4;
                                                    throw new JSONException("unclosed string : " + next4);
                                            }
                                    }
                                } else {
                                    next = next();
                                    next2 = next();
                                    boolean z11 = (next >= '0' && next <= '9') || (next >= 'a' && next <= 'f') || (next >= 'A' && next <= 'F');
                                    if ((next2 < '0' || next2 > '9') && ((next2 < 'a' || next2 > 'f') && (next2 < 'A' || next2 > 'F'))) {
                                        z10 = false;
                                    }
                                    if (z11 && z10) {
                                        int[] iArr = digits;
                                        putChar((char) ((iArr[next] * 16) + iArr[next2]));
                                    }
                                }
                            }
                        }
                        putChar('\f');
                    } else {
                        putChar('\'');
                    }
                } else if (this.hasSpecial) {
                    int i11 = this.f3986sp;
                    char[] cArr3 = this.sbuf;
                    if (i11 == cArr3.length) {
                        putChar(next3);
                    } else {
                        this.f3986sp = i11 + 1;
                        cArr3[i11] = next3;
                    }
                } else {
                    this.f3986sp++;
                }
            } else {
                if (isEOF()) {
                    throw new JSONException("unclosed string : " + next3);
                }
                putChar(JSONLexer.EOI);
            }
        }
        throw new JSONException("invalid escape character \\x" + next + next2);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void scanStringArray(Collection<String> collection, char c10) {
        char cCharAt;
        int i10;
        int i11;
        char cCharAt2;
        this.matchStat = 0;
        char cCharAt3 = charAt(this.f3983bp);
        char c11 = 'u';
        char c12 = 'l';
        if (cCharAt3 == 'n' && charAt(this.f3983bp + 1) == 'u' && charAt(this.f3983bp + 2) == 'l' && charAt(this.f3983bp + 3) == 'l' && charAt(this.f3983bp + 4) == c10) {
            int i12 = this.f3983bp + 5;
            this.f3983bp = i12;
            this.f3984ch = charAt(i12);
            this.matchStat = 5;
            return;
        }
        if (cCharAt3 != '[') {
            this.matchStat = -1;
            return;
        }
        char cCharAt4 = charAt(this.f3983bp + 1);
        int i13 = 2;
        while (true) {
            if (cCharAt4 == 'n' && charAt(this.f3983bp + i13) == c11 && charAt(this.f3983bp + i13 + 1) == c12 && charAt(this.f3983bp + i13 + 2) == c12) {
                int i14 = i13 + 3;
                i10 = i13 + 4;
                cCharAt = charAt(this.f3983bp + i14);
                collection.add(null);
            } else {
                if (cCharAt4 == ']' && collection.size() == 0) {
                    i11 = i13 + 1;
                    cCharAt2 = charAt(this.f3983bp + i13);
                    break;
                }
                if (cCharAt4 != '\"') {
                    this.matchStat = -1;
                    return;
                }
                int i15 = this.f3983bp + i13;
                int iIndexOf = indexOf('\"', i15);
                if (iIndexOf == -1) {
                    throw new JSONException("unclosed str");
                }
                String strSubString = subString(this.f3983bp + i13, iIndexOf - i15);
                if (strSubString.indexOf(92) != -1) {
                    while (true) {
                        int i16 = 0;
                        for (int i17 = iIndexOf - 1; i17 >= 0 && charAt(i17) == '\\'; i17--) {
                            i16++;
                        }
                        if (i16 % 2 == 0) {
                            break;
                        } else {
                            iIndexOf = indexOf('\"', iIndexOf + 1);
                        }
                    }
                    int i18 = iIndexOf - i15;
                    strSubString = readString(sub_chars(this.f3983bp + i13, i18), i18);
                }
                int i19 = this.f3983bp;
                int i20 = i13 + (iIndexOf - (i19 + i13)) + 1;
                cCharAt = charAt(i19 + i20);
                collection.add(strSubString);
                i10 = i20 + 1;
            }
            if (cCharAt == ',') {
                char cCharAt5 = charAt(this.f3983bp + i10);
                i13 = i10 + 1;
                c11 = 'u';
                c12 = 'l';
                cCharAt4 = cCharAt5;
            } else if (cCharAt != ']') {
                this.matchStat = -1;
                return;
            } else {
                i11 = i10 + 1;
                cCharAt2 = charAt(this.f3983bp + i10);
            }
        }
        if (cCharAt2 != c10) {
            this.matchStat = -1;
            return;
        }
        int i21 = this.f3983bp + i11;
        this.f3983bp = i21;
        this.f3984ch = charAt(i21);
        this.matchStat = 3;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final String scanSymbol(SymbolTable symbolTable) {
        skipWhitespace();
        char c10 = this.f3984ch;
        if (c10 == '\"') {
            return scanSymbol(symbolTable, '\"');
        }
        if (c10 == '\'') {
            if (isEnabled(Feature.AllowSingleQuotes)) {
                return scanSymbol(symbolTable, '\'');
            }
            throw new JSONException("syntax error");
        }
        if (c10 == '}') {
            next();
            this.token = 13;
            return null;
        }
        if (c10 == ',') {
            next();
            this.token = 16;
            return null;
        }
        if (c10 == 26) {
            this.token = 20;
            return null;
        }
        if (isEnabled(Feature.AllowUnQuotedFieldNames)) {
            return scanSymbolUnQuoted(symbolTable);
        }
        throw new JSONException("syntax error");
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final String scanSymbolUnQuoted(SymbolTable symbolTable) {
        if (this.token == 1 && this.pos == 0 && this.f3983bp == 1) {
            this.f3983bp = 0;
        }
        boolean[] zArr = IOUtils.firstIdentifierFlags;
        int i10 = this.f3984ch;
        if (i10 < zArr.length && !zArr[i10]) {
            throw new JSONException("illegal identifier : " + this.f3984ch + info());
        }
        boolean[] zArr2 = IOUtils.identifierFlags;
        this.f3985np = this.f3983bp;
        this.f3986sp = 1;
        while (true) {
            char next = next();
            if (next < zArr2.length && !zArr2[next]) {
                break;
            }
            i10 = (i10 * 31) + next;
            this.f3986sp++;
        }
        this.f3984ch = charAt(this.f3983bp);
        this.token = 18;
        if (this.f3986sp == 4 && i10 == 3392903 && charAt(this.f3985np) == 'n' && charAt(this.f3985np + 1) == 'u' && charAt(this.f3985np + 2) == 'l' && charAt(this.f3985np + 3) == 'l') {
            return null;
        }
        return symbolTable == null ? subString(this.f3985np, this.f3986sp) : addSymbol(this.f3985np, this.f3986sp, i10, symbolTable);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public String scanSymbolWithSeperator(SymbolTable symbolTable, char c10) {
        int i10 = 0;
        this.matchStat = 0;
        char cCharAt = charAt(this.f3983bp);
        if (cCharAt == 'n') {
            if (charAt(this.f3983bp + 1) != 'u' || charAt(this.f3983bp + 2) != 'l' || charAt(this.f3983bp + 3) != 'l') {
                this.matchStat = -1;
                return null;
            }
            if (charAt(this.f3983bp + 4) != c10) {
                this.matchStat = -1;
                return null;
            }
            int i11 = this.f3983bp + 5;
            this.f3983bp = i11;
            this.f3984ch = charAt(i11);
            this.matchStat = 3;
            return null;
        }
        if (cCharAt != '\"') {
            this.matchStat = -1;
            return null;
        }
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = charAt(this.f3983bp + i12);
            if (cCharAt2 == '\"') {
                int i14 = this.f3983bp;
                int i15 = i14 + 1;
                String strAddSymbol = addSymbol(i15, ((i14 + i13) - i15) - 1, i10, symbolTable);
                int i16 = i12 + 2;
                char cCharAt3 = charAt(this.f3983bp + i13);
                while (cCharAt3 != c10) {
                    if (!isWhitespace(cCharAt3)) {
                        this.matchStat = -1;
                        return strAddSymbol;
                    }
                    cCharAt3 = charAt(this.f3983bp + i16);
                    i16++;
                }
                int i17 = this.f3983bp + i16;
                this.f3983bp = i17;
                this.f3984ch = charAt(i17);
                this.matchStat = 3;
                return strAddSymbol;
            }
            i10 = (i10 * 31) + cCharAt2;
            if (cCharAt2 == '\\') {
                this.matchStat = -1;
                return null;
            }
            i12 = i13;
        }
    }

    public final void scanTrue() {
        if (this.f3984ch != 't') {
            throw new JSONException("error parse true");
        }
        next();
        if (this.f3984ch != 'r') {
            throw new JSONException("error parse true");
        }
        next();
        if (this.f3984ch != 'u') {
            throw new JSONException("error parse true");
        }
        next();
        if (this.f3984ch != 'e') {
            throw new JSONException("error parse true");
        }
        next();
        char c10 = this.f3984ch;
        if (c10 != ' ' && c10 != ',' && c10 != '}' && c10 != ']' && c10 != '\n' && c10 != '\r' && c10 != '\t' && c10 != 26 && c10 != '\f' && c10 != '\b' && c10 != ':' && c10 != '/') {
            throw new JSONException("scan true error");
        }
        this.token = 6;
    }

    public final int scanType(String str) {
        int i10;
        this.matchStat = 0;
        char[] cArr = typeFieldName;
        if (!charArrayCompare(cArr)) {
            return -2;
        }
        int length = this.f3983bp + cArr.length;
        int length2 = str.length();
        for (int i11 = 0; i11 < length2; i11++) {
            if (str.charAt(i11) != charAt(length + i11)) {
                return -1;
            }
        }
        int i12 = length + length2;
        if (charAt(i12) != '\"') {
            return -1;
        }
        int i13 = i12 + 1;
        char cCharAt = charAt(i13);
        this.f3984ch = cCharAt;
        if (cCharAt == ',') {
            int i14 = i12 + 2;
            this.f3984ch = charAt(i14);
            this.f3983bp = i14;
            this.token = 16;
            return 3;
        }
        if (cCharAt == '}') {
            i13 = i12 + 2;
            char cCharAt2 = charAt(i13);
            this.f3984ch = cCharAt2;
            if (cCharAt2 == ',') {
                this.token = 16;
                i10 = i12 + 3;
                this.f3984ch = charAt(i10);
            } else if (cCharAt2 == ']') {
                this.token = 15;
                i10 = i12 + 3;
                this.f3984ch = charAt(i10);
            } else if (cCharAt2 == '}') {
                this.token = 13;
                i10 = i12 + 3;
                this.f3984ch = charAt(i10);
            } else {
                if (cCharAt2 != 26) {
                    return -1;
                }
                this.token = 20;
                this.matchStat = 4;
            }
            i13 = i10;
            this.matchStat = 4;
        }
        this.f3983bp = i13;
        return this.matchStat;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public String scanTypeName(SymbolTable symbolTable) {
        return null;
    }

    public UUID scanUUID(char c10) {
        UUID uuid;
        int i10;
        int i11;
        char cCharAt;
        int i12;
        UUID uuid2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        this.matchStat = 0;
        char cCharAt2 = charAt(this.f3983bp);
        if (cCharAt2 == '\"') {
            int iIndexOf = indexOf('\"', this.f3983bp + 1);
            if (iIndexOf == -1) {
                throw new JSONException("unclosed str");
            }
            int i20 = this.f3983bp + 1;
            int i21 = iIndexOf - i20;
            char c11 = 'A';
            uuid = null;
            i10 = 4;
            if (i21 == 36) {
                long j10 = 0;
                i11 = 3;
                for (int i22 = 0; i22 < 8; i22++) {
                    char cCharAt3 = charAt(i20 + i22);
                    if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                        i19 = cCharAt3 - '0';
                    } else if (cCharAt3 >= 'a' && cCharAt3 <= 'f') {
                        i19 = cCharAt3 - 'W';
                    } else {
                        if (cCharAt3 < 'A' || cCharAt3 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i19 = cCharAt3 - '7';
                    }
                    j10 = (j10 << 4) | i19;
                }
                int i23 = 9;
                for (int i24 = 13; i23 < i24; i24 = 13) {
                    char cCharAt4 = charAt(i20 + i23);
                    if (cCharAt4 >= '0' && cCharAt4 <= '9') {
                        i18 = cCharAt4 - '0';
                    } else if (cCharAt4 >= 'a' && cCharAt4 <= 'f') {
                        i18 = cCharAt4 - 'W';
                    } else {
                        if (cCharAt4 < 'A' || cCharAt4 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i18 = cCharAt4 - '7';
                    }
                    j10 = (j10 << 4) | i18;
                    i23++;
                }
                int i25 = 14;
                long j11 = j10;
                while (i25 < 18) {
                    char cCharAt5 = charAt(i20 + i25);
                    if (cCharAt5 >= '0' && cCharAt5 <= '9') {
                        i17 = cCharAt5 - '0';
                    } else if (cCharAt5 >= 'a' && cCharAt5 <= 'f') {
                        i17 = cCharAt5 - 'W';
                    } else {
                        if (cCharAt5 < c11 || cCharAt5 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i17 = cCharAt5 - '7';
                    }
                    j11 = (j11 << 4) | i17;
                    i25++;
                    iIndexOf = iIndexOf;
                    c11 = 'A';
                }
                int i26 = iIndexOf;
                long j12 = 0;
                for (int i27 = 19; i27 < 23; i27++) {
                    char cCharAt6 = charAt(i20 + i27);
                    if (cCharAt6 >= '0' && cCharAt6 <= '9') {
                        i16 = cCharAt6 - '0';
                    } else if (cCharAt6 >= 'a' && cCharAt6 <= 'f') {
                        i16 = cCharAt6 - 'W';
                    } else {
                        if (cCharAt6 < 'A' || cCharAt6 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i16 = cCharAt6 - '7';
                    }
                    j12 = (j12 << 4) | i16;
                }
                int i28 = 24;
                long j13 = j12;
                for (int i29 = 36; i28 < i29; i29 = 36) {
                    char cCharAt7 = charAt(i20 + i28);
                    if (cCharAt7 >= '0' && cCharAt7 <= '9') {
                        i15 = cCharAt7 - '0';
                    } else if (cCharAt7 >= 'a' && cCharAt7 <= 'f') {
                        i15 = cCharAt7 - 'W';
                    } else {
                        if (cCharAt7 < 'A' || cCharAt7 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i15 = cCharAt7 - '7';
                    }
                    j13 = (j13 << 4) | i15;
                    i28++;
                }
                uuid2 = new UUID(j11, j13);
                int i30 = this.f3983bp;
                int i31 = i26 - (i30 + 1);
                int i32 = i31 + 2;
                i12 = i31 + 3;
                cCharAt = charAt(i30 + i32);
            } else {
                i11 = 3;
                if (i21 != 32) {
                    this.matchStat = -1;
                    return null;
                }
                long j14 = 0;
                for (int i33 = 0; i33 < 16; i33++) {
                    char cCharAt8 = charAt(i20 + i33);
                    if (cCharAt8 >= '0' && cCharAt8 <= '9') {
                        i14 = cCharAt8 - '0';
                    } else if (cCharAt8 >= 'a' && cCharAt8 <= 'f') {
                        i14 = cCharAt8 - 'W';
                    } else {
                        if (cCharAt8 < 'A' || cCharAt8 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i14 = cCharAt8 - '7';
                    }
                    j14 = (j14 << 4) | i14;
                }
                int i34 = 16;
                long j15 = 0;
                for (int i35 = 32; i34 < i35; i35 = 32) {
                    char cCharAt9 = charAt(i20 + i34);
                    if (cCharAt9 >= '0' && cCharAt9 <= '9') {
                        i13 = cCharAt9 - '0';
                    } else if (cCharAt9 >= 'a' && cCharAt9 <= 'f') {
                        i13 = cCharAt9 - 'W';
                    } else {
                        if (cCharAt9 < 'A' || cCharAt9 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i13 = cCharAt9 - '7';
                        j15 = (j15 << 4) | i13;
                        i34++;
                    }
                    j15 = (j15 << 4) | i13;
                    i34++;
                }
                uuid2 = new UUID(j14, j15);
                int i36 = this.f3983bp;
                int i37 = iIndexOf - (i36 + 1);
                int i38 = i37 + 2;
                i12 = i37 + 3;
                cCharAt = charAt(i36 + i38);
            }
        } else {
            uuid = null;
            i10 = 4;
            i11 = 3;
            if (cCharAt2 != 'n' || charAt(this.f3983bp + 1) != 'u' || charAt(this.f3983bp + 2) != 'l' || charAt(this.f3983bp + 3) != 'l') {
                this.matchStat = -1;
                return null;
            }
            cCharAt = charAt(this.f3983bp + 4);
            i12 = 5;
            uuid2 = null;
        }
        if (cCharAt == ',') {
            int i39 = this.f3983bp + i12;
            this.f3983bp = i39;
            this.f3984ch = charAt(i39);
            this.matchStat = i11;
            return uuid2;
        }
        if (cCharAt != ']') {
            this.matchStat = -1;
            return uuid;
        }
        int i40 = i12 + 1;
        char cCharAt10 = charAt(this.f3983bp + i12);
        if (cCharAt10 == ',') {
            this.token = 16;
            int i41 = this.f3983bp + i40;
            this.f3983bp = i41;
            this.f3984ch = charAt(i41);
        } else if (cCharAt10 == ']') {
            this.token = 15;
            int i42 = this.f3983bp + i40;
            this.f3983bp = i42;
            this.f3984ch = charAt(i42);
        } else if (cCharAt10 == '}') {
            this.token = 13;
            int i43 = this.f3983bp + i40;
            this.f3983bp = i43;
            this.f3984ch = charAt(i43);
        } else {
            if (cCharAt10 != 26) {
                this.matchStat = -1;
                return uuid;
            }
            this.token = 20;
            this.f3983bp += i12;
            this.f3984ch = JSONLexer.EOI;
        }
        this.matchStat = i10;
        return uuid2;
    }

    public boolean seekArrayToItem(int i10) {
        throw new UnsupportedOperationException();
    }

    public int seekObjectToField(long j10, boolean z10) {
        throw new UnsupportedOperationException();
    }

    public int seekObjectToFieldDeepScan(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void setFeatures(int i10) {
        this.features = i10;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public void setToken(int i10) {
        this.token = i10;
    }

    public void skipArray() {
        throw new UnsupportedOperationException();
    }

    public void skipComment() {
        char c10;
        next();
        char c11 = this.f3984ch;
        if (c11 == '/') {
            do {
                next();
                c10 = this.f3984ch;
                if (c10 == '\n') {
                    next();
                    return;
                }
            } while (c10 != 26);
            return;
        }
        if (c11 != '*') {
            throw new JSONException("invalid comment");
        }
        next();
        while (true) {
            char c12 = this.f3984ch;
            if (c12 == 26) {
                return;
            }
            if (c12 == '*') {
                next();
                if (this.f3984ch == '/') {
                    next();
                    return;
                }
            } else {
                next();
            }
        }
    }

    public void skipObject() {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void skipWhitespace() {
        while (true) {
            char c10 = this.f3984ch;
            if (c10 > '/') {
                return;
            }
            if (c10 == ' ' || c10 == '\r' || c10 == '\n' || c10 == '\t' || c10 == '\f' || c10 == '\b') {
                next();
            } else if (c10 != '/') {
                return;
            } else {
                skipComment();
            }
        }
    }

    public final String stringDefaultValue() {
        return this.stringDefaultValue;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract String stringVal();

    public abstract String subString(int i10, int i11);

    public abstract char[] sub_chars(int i10, int i11);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final int token() {
        return this.token;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final String tokenName() {
        return JSONToken.name(this.token);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final boolean isEnabled(int i10) {
        return (i10 & this.features) != 0;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextTokenWithColon(int i10) throws NumberFormatException {
        nextTokenWithChar(':');
    }

    public final void scanNullOrNew(boolean z10) {
        if (this.f3984ch != 'n') {
            throw new JSONException("error parse null or new");
        }
        next();
        char c10 = this.f3984ch;
        if (c10 != 'u') {
            if (c10 != 'e') {
                throw new JSONException("error parse new");
            }
            next();
            if (this.f3984ch != 'w') {
                throw new JSONException("error parse new");
            }
            next();
            char c11 = this.f3984ch;
            if (c11 != ' ' && c11 != ',' && c11 != '}' && c11 != ']' && c11 != '\n' && c11 != '\r' && c11 != '\t' && c11 != 26 && c11 != '\f' && c11 != '\b') {
                throw new JSONException("scan new error");
            }
            this.token = 9;
            return;
        }
        next();
        if (this.f3984ch != 'l') {
            throw new JSONException("error parse null");
        }
        next();
        if (this.f3984ch != 'l') {
            throw new JSONException("error parse null");
        }
        next();
        char c12 = this.f3984ch;
        if (c12 != ' ' && c12 != ',' && c12 != '}' && c12 != ']' && c12 != '\n' && c12 != '\r' && c12 != '\t' && c12 != 26 && ((c12 != ':' || !z10) && c12 != '\f' && c12 != '\b')) {
            throw new JSONException("scan null error");
        }
        this.token = 8;
    }

    public int seekObjectToField(long[] jArr) {
        throw new UnsupportedOperationException();
    }

    public void skipObject(boolean z10) {
        throw new UnsupportedOperationException();
    }

    public final boolean isEnabled(int i10, int i11) {
        return ((this.features & i11) == 0 && (i10 & i11) == 0) ? false : true;
    }

    public int matchField(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final String scanSymbol(SymbolTable symbolTable, char c10) throws NumberFormatException {
        String strAddSymbol;
        this.f3985np = this.f3983bp;
        this.f3986sp = 0;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            char next = next();
            if (next == c10) {
                this.token = 4;
                if (!z10) {
                    int i11 = this.f3985np;
                    strAddSymbol = addSymbol(i11 == -1 ? 0 : i11 + 1, this.f3986sp, i10, symbolTable);
                } else {
                    strAddSymbol = symbolTable.addSymbol(this.sbuf, 0, this.f3986sp, i10);
                }
                this.f3986sp = 0;
                next();
                return strAddSymbol;
            }
            if (next == 26) {
                throw new JSONException("unclosed.str");
            }
            if (next == '\\') {
                if (!z10) {
                    int i12 = this.f3986sp;
                    char[] cArr = this.sbuf;
                    if (i12 >= cArr.length) {
                        int length = cArr.length * 2;
                        if (i12 <= length) {
                            i12 = length;
                        }
                        char[] cArr2 = new char[i12];
                        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                        this.sbuf = cArr2;
                    }
                    arrayCopy(this.f3985np + 1, this.sbuf, 0, this.f3986sp);
                    z10 = true;
                }
                char next2 = next();
                if (next2 == '\"') {
                    i10 = (i10 * 31) + 34;
                    putChar('\"');
                } else if (next2 != '\'') {
                    if (next2 != 'F') {
                        if (next2 == '\\') {
                            i10 = (i10 * 31) + 92;
                            putChar('\\');
                        } else if (next2 == 'b') {
                            i10 = (i10 * 31) + 8;
                            putChar('\b');
                        } else if (next2 != 'f') {
                            if (next2 == 'n') {
                                i10 = (i10 * 31) + 10;
                                putChar('\n');
                            } else if (next2 == 'r') {
                                i10 = (i10 * 31) + 13;
                                putChar('\r');
                            } else if (next2 != 'x') {
                                switch (next2) {
                                    case '/':
                                        i10 = (i10 * 31) + 47;
                                        putChar('/');
                                        break;
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 0);
                                        break;
                                    case '1':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 1);
                                        break;
                                    case '2':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 2);
                                        break;
                                    case '3':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 3);
                                        break;
                                    case '4':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 4);
                                        break;
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 5);
                                        break;
                                    case '6':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 6);
                                        break;
                                    case '7':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 7);
                                        break;
                                    default:
                                        switch (next2) {
                                            case 't':
                                                i10 = (i10 * 31) + 9;
                                                putChar('\t');
                                                break;
                                            case 'u':
                                                int i13 = Integer.parseInt(new String(new char[]{next(), next(), next(), next()}), 16);
                                                i10 = (i10 * 31) + i13;
                                                putChar((char) i13);
                                                break;
                                            case 'v':
                                                i10 = (i10 * 31) + 11;
                                                putChar((char) 11);
                                                break;
                                            default:
                                                this.f3984ch = next2;
                                                throw new JSONException("unclosed.str.lit");
                                        }
                                }
                            } else {
                                char next3 = next();
                                this.f3984ch = next3;
                                char next4 = next();
                                this.f3984ch = next4;
                                int[] iArr = digits;
                                char c11 = (char) ((iArr[next3] * 16) + iArr[next4]);
                                i10 = (i10 * 31) + c11;
                                putChar(c11);
                            }
                        }
                    }
                    i10 = (i10 * 31) + 12;
                    putChar('\f');
                } else {
                    i10 = (i10 * 31) + 39;
                    putChar('\'');
                }
            } else {
                i10 = (i10 * 31) + next;
                if (!z10) {
                    this.f3986sp++;
                } else {
                    int i14 = this.f3986sp;
                    char[] cArr3 = this.sbuf;
                    if (i14 == cArr3.length) {
                        putChar(next);
                    } else {
                        this.f3986sp = i14 + 1;
                        cArr3[i14] = next;
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x007b A[SYNTHETIC] */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nextToken(int r11) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.nextToken(int):void");
    }

    public String[] scanFieldStringArray(char[] cArr, int i10, SymbolTable symbolTable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public String scanString(char c10) {
        this.matchStat = 0;
        char cCharAt = charAt(this.f3983bp);
        if (cCharAt == 'n') {
            if (charAt(this.f3983bp + 1) == 'u' && charAt(this.f3983bp + 2) == 'l' && charAt(this.f3983bp + 3) == 'l') {
                if (charAt(this.f3983bp + 4) == c10) {
                    int i10 = this.f3983bp + 5;
                    this.f3983bp = i10;
                    this.f3984ch = charAt(i10);
                    this.matchStat = 3;
                    return null;
                }
                this.matchStat = -1;
                return null;
            }
            this.matchStat = -1;
            return null;
        }
        int i11 = 1;
        while (cCharAt != '\"') {
            if (isWhitespace(cCharAt)) {
                cCharAt = charAt(this.f3983bp + i11);
                i11++;
            } else {
                this.matchStat = -1;
                return stringDefaultValue();
            }
        }
        int i12 = this.f3983bp + i11;
        int iIndexOf = indexOf('\"', i12);
        if (iIndexOf != -1) {
            String strSubString = subString(this.f3983bp + i11, iIndexOf - i12);
            if (strSubString.indexOf(92) != -1) {
                while (true) {
                    int i13 = 0;
                    for (int i14 = iIndexOf - 1; i14 >= 0 && charAt(i14) == '\\'; i14--) {
                        i13++;
                    }
                    if (i13 % 2 == 0) {
                        break;
                    }
                    iIndexOf = indexOf('\"', iIndexOf + 1);
                }
                int i15 = iIndexOf - i12;
                strSubString = readString(sub_chars(this.f3983bp + 1, i15), i15);
            }
            int i16 = i11 + (iIndexOf - i12) + 1;
            int i17 = i16 + 1;
            char cCharAt2 = charAt(this.f3983bp + i16);
            while (cCharAt2 != c10) {
                if (!isWhitespace(cCharAt2)) {
                    if (cCharAt2 == ']') {
                        int i18 = this.f3983bp + i17;
                        this.f3983bp = i18;
                        this.f3984ch = charAt(i18);
                        this.matchStat = -1;
                    }
                    return strSubString;
                }
                cCharAt2 = charAt(this.f3983bp + i17);
                i17++;
            }
            int i19 = this.f3983bp + i17;
            this.f3983bp = i19;
            this.f3984ch = charAt(i19);
            this.matchStat = 3;
            this.token = 16;
            return strSubString;
        }
        throw new JSONException("unclosed str");
    }
}
