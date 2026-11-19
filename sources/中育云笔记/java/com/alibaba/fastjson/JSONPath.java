package com.alibaba.fastjson;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.FieldSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.util.TypeUtils;
import com.tendcloud.tenddata.C7979fc;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes3.dex */
public class JSONPath implements JSONAware {
    static final long LENGTH = -1580386065683472715L;
    static final long SIZE = 5614464919154503228L;
    private static ConcurrentMap<String, JSONPath> pathCache = new ConcurrentHashMap(128, 0.75f, 1);
    private boolean hasRefSegment;
    private ParserConfig parserConfig;
    private final String path;
    private Segment[] segments;
    private SerializeConfig serializeConfig;

    /* renamed from: com.alibaba.fastjson.JSONPath$1 */
    public static /* synthetic */ class C55141 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$fastjson$JSONPath$Operator;

        static {
            int[] iArr = new int[Operator.values().length];
            $SwitchMap$com$alibaba$fastjson$JSONPath$Operator = iArr;
            try {
                iArr[Operator.EQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPath$Operator[Operator.NE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPath$Operator[Operator.GE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPath$Operator[Operator.GT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPath$Operator[Operator.LE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPath$Operator[Operator.LT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class ArrayAccessSegment implements Segment {
        private final int index;

        public ArrayAccessSegment(int i10) {
            this.index = i10;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            return jSONPath.getArrayItem(obj2, this.index);
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            if (((JSONLexerBase) defaultJSONParser.lexer).seekArrayToItem(this.index) && context.eval) {
                context.object = defaultJSONParser.parse();
            }
        }

        public boolean remove(JSONPath jSONPath, Object obj) {
            return jSONPath.removeArrayItem(jSONPath, obj, this.index);
        }

        public boolean setValue(JSONPath jSONPath, Object obj, Object obj2) {
            return jSONPath.setArrayItem(jSONPath, obj, this.index, obj2);
        }
    }

    public static class Context {
        final boolean eval;
        Object object;
        final Context parent;

        public Context(Context context, boolean z10) {
            this.parent = context;
            this.eval = z10;
        }
    }

    public static class DoubleOpSegement extends PropertyFilter {

        /* renamed from: op */
        private final Operator f3963op;
        private final double value;

        public DoubleOpSegement(String str, boolean z10, double d10, Operator operator) {
            super(str, z10);
            this.value = d10;
            this.f3963op = operator;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object obj4 = get(jSONPath, obj, obj3);
            if (obj4 == null || !(obj4 instanceof Number)) {
                return false;
            }
            double dDoubleValue = ((Number) obj4).doubleValue();
            switch (C55141.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3963op.ordinal()]) {
                case 1:
                    if (dDoubleValue == this.value) {
                    }
                    break;
                case 2:
                    if (dDoubleValue != this.value) {
                    }
                    break;
                case 3:
                    if (dDoubleValue >= this.value) {
                    }
                    break;
                case 4:
                    if (dDoubleValue > this.value) {
                    }
                    break;
                case 5:
                    if (dDoubleValue <= this.value) {
                    }
                    break;
                case 6:
                    if (dDoubleValue < this.value) {
                    }
                    break;
            }
            return false;
        }
    }

    public interface Filter {
        boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3);
    }

    public static class FilterGroup implements Filter {
        private boolean and;
        private List<Filter> fitlers;

        public FilterGroup(Filter filter, Filter filter2, boolean z10) {
            ArrayList arrayList = new ArrayList(2);
            this.fitlers = arrayList;
            arrayList.add(filter);
            this.fitlers.add(filter2);
            this.and = z10;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            if (this.and) {
                Iterator<Filter> it = this.fitlers.iterator();
                while (it.hasNext()) {
                    if (!it.next().apply(jSONPath, obj, obj2, obj3)) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<Filter> it2 = this.fitlers.iterator();
            while (it2.hasNext()) {
                if (it2.next().apply(jSONPath, obj, obj2, obj3)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class FilterSegment implements Segment {
        private final Filter filter;

        public FilterSegment(Filter filter) {
            this.filter = filter;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            if (obj2 == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            if (!(obj2 instanceof Iterable)) {
                if (this.filter.apply(jSONPath, obj, obj2, obj2)) {
                    return obj2;
                }
                return null;
            }
            for (Object obj3 : (Iterable) obj2) {
                if (this.filter.apply(jSONPath, obj, obj2, obj3)) {
                    jSONArray.add(obj3);
                }
            }
            return jSONArray;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            Object obj = defaultJSONParser.parse();
            context.object = eval(jSONPath, obj, obj);
        }

        public boolean remove(JSONPath jSONPath, Object obj, Object obj2) {
            if (obj2 == null || !(obj2 instanceof Iterable)) {
                return false;
            }
            Iterator it = ((Iterable) obj2).iterator();
            while (it.hasNext()) {
                if (this.filter.apply(jSONPath, obj, obj2, it.next())) {
                    it.remove();
                }
            }
            return true;
        }
    }

    public static class FloorSegment implements Segment {
        public static final FloorSegment instance = new FloorSegment();

        private static Object floor(Object obj) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof Float) {
                return Double.valueOf(Math.floor(((Float) obj).floatValue()));
            }
            if (obj instanceof Double) {
                return Double.valueOf(Math.floor(((Double) obj).doubleValue()));
            }
            if (obj instanceof BigDecimal) {
                return ((BigDecimal) obj).setScale(0, RoundingMode.FLOOR);
            }
            if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof BigInteger)) {
                return obj;
            }
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            if (!(obj2 instanceof JSONArray)) {
                return floor(obj2);
            }
            JSONArray jSONArray = (JSONArray) ((JSONArray) obj2).clone();
            for (int i10 = 0; i10 < jSONArray.size(); i10++) {
                Object obj3 = jSONArray.get(i10);
                Object objFloor = floor(obj3);
                if (objFloor != obj3) {
                    jSONArray.set(i10, objFloor);
                }
            }
            return jSONArray;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            throw new UnsupportedOperationException();
        }
    }

    public static class IntBetweenSegement extends PropertyFilter {
        private final long endValue;
        private final boolean not;
        private final long startValue;

        public IntBetweenSegement(String str, boolean z10, long j10, long j11, boolean z11) {
            super(str, z10);
            this.startValue = j10;
            this.endValue = j11;
            this.not = z11;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object obj4 = get(jSONPath, obj, obj3);
            if (obj4 == null) {
                return false;
            }
            if (obj4 instanceof Number) {
                long jLongExtractValue = TypeUtils.longExtractValue((Number) obj4);
                if (jLongExtractValue >= this.startValue && jLongExtractValue <= this.endValue) {
                    return !this.not;
                }
            }
            return this.not;
        }
    }

    public static class IntInSegement extends PropertyFilter {
        private final boolean not;
        private final long[] values;

        public IntInSegement(String str, boolean z10, long[] jArr, boolean z11) {
            super(str, z10);
            this.values = jArr;
            this.not = z11;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object obj4 = get(jSONPath, obj, obj3);
            if (obj4 == null) {
                return false;
            }
            if (obj4 instanceof Number) {
                long jLongExtractValue = TypeUtils.longExtractValue((Number) obj4);
                for (long j10 : this.values) {
                    if (j10 == jLongExtractValue) {
                        return !this.not;
                    }
                }
            }
            return this.not;
        }
    }

    public static class IntObjInSegement extends PropertyFilter {
        private final boolean not;
        private final Long[] values;

        public IntObjInSegement(String str, boolean z10, Long[] lArr, boolean z11) {
            super(str, z10);
            this.values = lArr;
            this.not = z11;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            boolean z10;
            Object obj4 = get(jSONPath, obj, obj3);
            int i10 = 0;
            if (obj4 == null) {
                Long[] lArr = this.values;
                int length = lArr.length;
                while (i10 < length) {
                    if (lArr[i10] == null) {
                        z10 = this.not;
                    } else {
                        i10++;
                    }
                }
                return this.not;
            }
            if (obj4 instanceof Number) {
                long jLongExtractValue = TypeUtils.longExtractValue((Number) obj4);
                Long[] lArr2 = this.values;
                int length2 = lArr2.length;
                while (i10 < length2) {
                    Long l10 = lArr2[i10];
                    if (l10 != null && l10.longValue() == jLongExtractValue) {
                        z10 = this.not;
                    } else {
                        i10++;
                    }
                }
            }
            return this.not;
            return !z10;
        }
    }

    public static class IntOpSegement extends PropertyFilter {

        /* renamed from: op */
        private final Operator f3964op;
        private final long value;
        private BigDecimal valueDecimal;
        private Double valueDouble;
        private Float valueFloat;

        public IntOpSegement(String str, boolean z10, long j10, Operator operator) {
            super(str, z10);
            this.value = j10;
            this.f3964op = operator;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object obj4 = get(jSONPath, obj, obj3);
            if (obj4 == null || !(obj4 instanceof Number)) {
                return false;
            }
            if (obj4 instanceof BigDecimal) {
                if (this.valueDecimal == null) {
                    this.valueDecimal = BigDecimal.valueOf(this.value);
                }
                int iCompareTo = this.valueDecimal.compareTo((BigDecimal) obj4);
                switch (C55141.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3964op.ordinal()]) {
                    case 1:
                        if (iCompareTo == 0) {
                        }
                        break;
                    case 2:
                        if (iCompareTo != 0) {
                        }
                        break;
                    case 3:
                        if (iCompareTo <= 0) {
                        }
                        break;
                    case 4:
                        if (iCompareTo < 0) {
                        }
                        break;
                    case 5:
                        if (iCompareTo >= 0) {
                        }
                        break;
                    case 6:
                        if (iCompareTo > 0) {
                        }
                        break;
                }
                return false;
            }
            if (obj4 instanceof Float) {
                if (this.valueFloat == null) {
                    this.valueFloat = Float.valueOf(this.value);
                }
                int iCompareTo2 = this.valueFloat.compareTo((Float) obj4);
                switch (C55141.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3964op.ordinal()]) {
                    case 1:
                        if (iCompareTo2 == 0) {
                        }
                        break;
                    case 2:
                        if (iCompareTo2 != 0) {
                        }
                        break;
                    case 3:
                        if (iCompareTo2 <= 0) {
                        }
                        break;
                    case 4:
                        if (iCompareTo2 < 0) {
                        }
                        break;
                    case 5:
                        if (iCompareTo2 >= 0) {
                        }
                        break;
                    case 6:
                        if (iCompareTo2 > 0) {
                        }
                        break;
                }
                return false;
            }
            if (!(obj4 instanceof Double)) {
                long jLongExtractValue = TypeUtils.longExtractValue((Number) obj4);
                switch (C55141.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3964op.ordinal()]) {
                    case 1:
                        if (jLongExtractValue == this.value) {
                        }
                        break;
                    case 2:
                        if (jLongExtractValue != this.value) {
                        }
                        break;
                    case 3:
                        if (jLongExtractValue >= this.value) {
                        }
                        break;
                    case 4:
                        if (jLongExtractValue > this.value) {
                        }
                        break;
                    case 5:
                        if (jLongExtractValue <= this.value) {
                        }
                        break;
                    case 6:
                        if (jLongExtractValue < this.value) {
                        }
                        break;
                }
                return false;
            }
            if (this.valueDouble == null) {
                this.valueDouble = Double.valueOf(this.value);
            }
            int iCompareTo3 = this.valueDouble.compareTo((Double) obj4);
            switch (C55141.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3964op.ordinal()]) {
                case 1:
                    if (iCompareTo3 == 0) {
                    }
                    break;
                case 2:
                    if (iCompareTo3 != 0) {
                    }
                    break;
                case 3:
                    if (iCompareTo3 <= 0) {
                    }
                    break;
                case 4:
                    if (iCompareTo3 < 0) {
                    }
                    break;
                case 5:
                    if (iCompareTo3 >= 0) {
                    }
                    break;
                case 6:
                    if (iCompareTo3 > 0) {
                    }
                    break;
            }
            return false;
        }
    }

    public static class JSONPathParser {

        /* renamed from: ch */
        private char f3965ch;
        private boolean hasRefSegment;
        private int level;
        private final String path;
        private int pos;
        private static final String strArrayRegex = "'\\s*,\\s*'";
        private static final Pattern strArrayPatternx = Pattern.compile(strArrayRegex);

        public JSONPathParser(String str) {
            this.path = str;
            next();
        }

        public static boolean isDigitFirst(char c10) {
            if (c10 == '-' || c10 == '+') {
                return true;
            }
            return c10 >= '0' && c10 <= '9';
        }

        public void accept(char c10) {
            if (this.f3965ch == ' ') {
                next();
            }
            if (this.f3965ch == c10) {
                if (isEOF()) {
                    return;
                }
                next();
            } else {
                throw new JSONPathException("expect '" + c10 + ", but '" + this.f3965ch + "'");
            }
        }

        public Segment buildArraySegement(String str) {
            int length = str.length();
            char cCharAt = str.charAt(0);
            int i10 = length - 1;
            char cCharAt2 = str.charAt(i10);
            int iIndexOf = str.indexOf(44);
            if (str.length() > 2 && cCharAt == '\'' && cCharAt2 == '\'') {
                String strSubstring = str.substring(1, i10);
                return (iIndexOf == -1 || !strArrayPatternx.matcher(str).find()) ? new PropertySegment(strSubstring, false) : new MultiPropertySegment(strSubstring.split(strArrayRegex));
            }
            int iIndexOf2 = str.indexOf(58);
            if (iIndexOf == -1 && iIndexOf2 == -1) {
                if (TypeUtils.isNumber(str)) {
                    try {
                        return new ArrayAccessSegment(Integer.parseInt(str));
                    } catch (NumberFormatException unused) {
                        return new PropertySegment(str, false);
                    }
                }
                if (str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') {
                    str = str.substring(1, str.length() - 1);
                }
                return new PropertySegment(str, false);
            }
            if (iIndexOf != -1) {
                String[] strArrSplit = str.split(",");
                int[] iArr = new int[strArrSplit.length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    iArr[i11] = Integer.parseInt(strArrSplit[i11]);
                }
                return new MultiIndexSegment(iArr);
            }
            if (iIndexOf2 == -1) {
                throw new UnsupportedOperationException();
            }
            String[] strArrSplit2 = str.split(":");
            int length2 = strArrSplit2.length;
            int[] iArr2 = new int[length2];
            for (int i12 = 0; i12 < strArrSplit2.length; i12++) {
                String str2 = strArrSplit2[i12];
                if (str2.length() != 0) {
                    iArr2[i12] = Integer.parseInt(str2);
                } else {
                    if (i12 != 0) {
                        throw new UnsupportedOperationException();
                    }
                    iArr2[i12] = 0;
                }
            }
            int i13 = iArr2[0];
            int i14 = length2 > 1 ? iArr2[1] : -1;
            int i15 = length2 == 3 ? iArr2[2] : 1;
            if (i14 < 0 || i14 >= i13) {
                if (i15 > 0) {
                    return new RangeSegment(i13, i14, i15);
                }
                throw new UnsupportedOperationException("step must greater than zero : " + i15);
            }
            throw new UnsupportedOperationException("end must greater than or equals start. start " + i13 + ",  end " + i14);
        }

        public Segment[] explain() {
            String str = this.path;
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException();
            }
            Segment[] segmentArr = new Segment[8];
            while (true) {
                Segment segement = readSegement();
                if (segement == null) {
                    break;
                }
                if (segement instanceof PropertySegment) {
                    PropertySegment propertySegment = (PropertySegment) segement;
                    if (propertySegment.deep || !propertySegment.propertyName.equals("*")) {
                    }
                }
                int i10 = this.level;
                if (i10 == segmentArr.length) {
                    Segment[] segmentArr2 = new Segment[(i10 * 3) / 2];
                    System.arraycopy(segmentArr, 0, segmentArr2, 0, i10);
                    segmentArr = segmentArr2;
                }
                int i11 = this.level;
                this.level = i11 + 1;
                segmentArr[i11] = segement;
            }
            int i12 = this.level;
            if (i12 == segmentArr.length) {
                return segmentArr;
            }
            Segment[] segmentArr3 = new Segment[i12];
            System.arraycopy(segmentArr, 0, segmentArr3, 0, i12);
            return segmentArr3;
        }

        public Filter filterRest(Filter filter) {
            char c10 = this.f3965ch;
            boolean z10 = true;
            boolean z11 = c10 == '&';
            if ((c10 != '&' || getNextChar() != '&') && (this.f3965ch != '|' || getNextChar() != '|')) {
                return filter;
            }
            next();
            next();
            if (this.f3965ch == '(') {
                next();
            } else {
                z10 = false;
            }
            while (this.f3965ch == ' ') {
                next();
            }
            FilterGroup filterGroup = new FilterGroup(filter, (Filter) parseArrayAccessFilter(false), z11);
            if (z10 && this.f3965ch == ')') {
                next();
            }
            return filterGroup;
        }

        public char getNextChar() {
            return this.path.charAt(this.pos);
        }

        public boolean isEOF() {
            return this.pos >= this.path.length();
        }

        public void next() {
            String str = this.path;
            int i10 = this.pos;
            this.pos = i10 + 1;
            this.f3965ch = str.charAt(i10);
        }

        public Segment parseArrayAccess(boolean z10) {
            Object arrayAccessFilter = parseArrayAccessFilter(z10);
            return arrayAccessFilter instanceof Segment ? (Segment) arrayAccessFilter : new FilterSegment((Filter) arrayAccessFilter);
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0119  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object parseArrayAccessFilter(boolean r26) {
            /*
                Method dump skipped, instructions count: 1841
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSONPath.JSONPathParser.parseArrayAccessFilter(boolean):java.lang.Object");
        }

        public double readDoubleValue(long j10) {
            int i10 = this.pos - 1;
            next();
            while (true) {
                char c10 = this.f3965ch;
                if (c10 < '0' || c10 > '9') {
                    break;
                }
                next();
            }
            return Double.parseDouble(this.path.substring(i10, this.pos - 1)) + j10;
        }

        public long readLongValue() {
            int i10 = this.pos - 1;
            char c10 = this.f3965ch;
            if (c10 == '+' || c10 == '-') {
                next();
            }
            while (true) {
                char c11 = this.f3965ch;
                if (c11 < '0' || c11 > '9') {
                    break;
                }
                next();
            }
            return Long.parseLong(this.path.substring(i10, this.pos - 1));
        }

        public String readName() {
            skipWhitespace();
            char c10 = this.f3965ch;
            if (c10 != '\\' && !Character.isJavaIdentifierStart(c10)) {
                throw new JSONPathException("illeal jsonpath syntax. " + this.path);
            }
            StringBuilder sb2 = new StringBuilder();
            while (!isEOF()) {
                char c11 = this.f3965ch;
                if (c11 == '\\') {
                    next();
                    sb2.append(this.f3965ch);
                    if (isEOF()) {
                        return sb2.toString();
                    }
                    next();
                } else {
                    if (!Character.isJavaIdentifierPart(c11)) {
                        break;
                    }
                    sb2.append(this.f3965ch);
                    next();
                }
            }
            if (isEOF() && Character.isJavaIdentifierPart(this.f3965ch)) {
                sb2.append(this.f3965ch);
            }
            return sb2.toString();
        }

        public Operator readOp() {
            Operator operator;
            char c10 = this.f3965ch;
            if (c10 == '=') {
                next();
                char c11 = this.f3965ch;
                if (c11 == '~') {
                    next();
                    operator = Operator.REG_MATCH;
                } else if (c11 == '=') {
                    next();
                    operator = Operator.EQ;
                } else {
                    operator = Operator.EQ;
                }
            } else if (c10 == '!') {
                next();
                accept('=');
                operator = Operator.NE;
            } else if (c10 == '<') {
                next();
                if (this.f3965ch == '=') {
                    next();
                    operator = Operator.LE;
                } else {
                    operator = Operator.LT;
                }
            } else if (c10 == '>') {
                next();
                if (this.f3965ch == '=') {
                    next();
                    operator = Operator.GE;
                } else {
                    operator = Operator.GT;
                }
            } else {
                operator = null;
            }
            if (operator != null) {
                return operator;
            }
            String name = readName();
            if ("not".equalsIgnoreCase(name)) {
                skipWhitespace();
                String name2 = readName();
                if ("like".equalsIgnoreCase(name2)) {
                    return Operator.NOT_LIKE;
                }
                if ("rlike".equalsIgnoreCase(name2)) {
                    return Operator.NOT_RLIKE;
                }
                if ("in".equalsIgnoreCase(name2)) {
                    return Operator.NOT_IN;
                }
                if ("between".equalsIgnoreCase(name2)) {
                    return Operator.NOT_BETWEEN;
                }
                throw new UnsupportedOperationException();
            }
            if ("nin".equalsIgnoreCase(name)) {
                return Operator.NOT_IN;
            }
            if ("like".equalsIgnoreCase(name)) {
                return Operator.LIKE;
            }
            if ("rlike".equalsIgnoreCase(name)) {
                return Operator.RLIKE;
            }
            if ("in".equalsIgnoreCase(name)) {
                return Operator.IN;
            }
            if ("between".equalsIgnoreCase(name)) {
                return Operator.BETWEEN;
            }
            throw new UnsupportedOperationException();
        }

        public Segment readSegement() {
            boolean z10 = true;
            if (this.level == 0 && this.path.length() == 1) {
                if (isDigitFirst(this.f3965ch)) {
                    return new ArrayAccessSegment(this.f3965ch - '0');
                }
                char c10 = this.f3965ch;
                if ((c10 >= 'a' && c10 <= 'z') || (c10 >= 'A' && c10 <= 'Z')) {
                    return new PropertySegment(Character.toString(c10), false);
                }
            }
            while (!isEOF()) {
                skipWhitespace();
                char c11 = this.f3965ch;
                if (c11 != '$') {
                    if (c11 != '.' && c11 != '/') {
                        if (c11 == '[') {
                            return parseArrayAccess(true);
                        }
                        if (this.level == 0) {
                            return new PropertySegment(readName(), false);
                        }
                        if (c11 == '?') {
                            return new FilterSegment((Filter) parseArrayAccessFilter(false));
                        }
                        throw new JSONPathException("not support jsonpath : " + this.path);
                    }
                    next();
                    if (c11 == '.' && this.f3965ch == '.') {
                        next();
                        int length = this.path.length();
                        int i10 = this.pos;
                        if (length > i10 + 3 && this.f3965ch == '[' && this.path.charAt(i10) == '*' && this.path.charAt(this.pos + 1) == ']' && this.path.charAt(this.pos + 2) == '.') {
                            next();
                            next();
                            next();
                            next();
                        }
                    } else {
                        z10 = false;
                    }
                    char c12 = this.f3965ch;
                    if (c12 == '*') {
                        if (!isEOF()) {
                            next();
                        }
                        return z10 ? WildCardSegment.instance_deep : WildCardSegment.instance;
                    }
                    if (isDigitFirst(c12)) {
                        return parseArrayAccess(false);
                    }
                    String name = readName();
                    if (this.f3965ch != '(') {
                        return new PropertySegment(name, z10);
                    }
                    next();
                    if (this.f3965ch != ')') {
                        throw new JSONPathException("not support jsonpath : " + this.path);
                    }
                    if (!isEOF()) {
                        next();
                    }
                    if ("size".equals(name) || C7979fc.a.LENGTH.equals(name)) {
                        return SizeSegment.instance;
                    }
                    if ("max".equals(name)) {
                        return MaxSegment.instance;
                    }
                    if ("min".equals(name)) {
                        return MinSegment.instance;
                    }
                    if ("keySet".equals(name)) {
                        return KeySetSegment.instance;
                    }
                    if ("type".equals(name)) {
                        return TypeSegment.instance;
                    }
                    if ("floor".equals(name)) {
                        return FloorSegment.instance;
                    }
                    throw new JSONPathException("not support jsonpath : " + this.path);
                }
                next();
                skipWhitespace();
                if (this.f3965ch == '?') {
                    return new FilterSegment((Filter) parseArrayAccessFilter(false));
                }
            }
            return null;
        }

        public String readString() {
            char c10 = this.f3965ch;
            next();
            int i10 = this.pos - 1;
            while (this.f3965ch != c10 && !isEOF()) {
                next();
            }
            String strSubstring = this.path.substring(i10, isEOF() ? this.pos : this.pos - 1);
            accept(c10);
            return strSubstring;
        }

        public Object readValue() {
            skipWhitespace();
            if (isDigitFirst(this.f3965ch)) {
                return Long.valueOf(readLongValue());
            }
            char c10 = this.f3965ch;
            if (c10 == '\"' || c10 == '\'') {
                return readString();
            }
            if (c10 != 'n') {
                throw new UnsupportedOperationException();
            }
            if ("null".equals(readName())) {
                return null;
            }
            throw new JSONPathException(this.path);
        }

        public final void skipWhitespace() {
            while (true) {
                char c10 = this.f3965ch;
                if (c10 > ' ') {
                    return;
                }
                if (c10 != ' ' && c10 != '\r' && c10 != '\n' && c10 != '\t' && c10 != '\f' && c10 != '\b') {
                    return;
                } else {
                    next();
                }
            }
        }
    }

    public static class KeySetSegment implements Segment {
        public static final KeySetSegment instance = new KeySetSegment();

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            return jSONPath.evalKeySet(obj2);
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            throw new UnsupportedOperationException();
        }
    }

    public static class MatchSegement extends PropertyFilter {
        private final String[] containsValues;
        private final String endsWithValue;
        private final int minLength;
        private final boolean not;
        private final String startsWithValue;

        public MatchSegement(String str, boolean z10, String str2, String str3, String[] strArr, boolean z11) {
            super(str, z10);
            this.startsWithValue = str2;
            this.endsWithValue = str3;
            this.containsValues = strArr;
            this.not = z11;
            int length = str2 != null ? str2.length() : 0;
            length = str3 != null ? length + str3.length() : length;
            if (strArr != null) {
                for (String str4 : strArr) {
                    length += str4.length();
                }
            }
            this.minLength = length;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            int length;
            Object obj4 = get(jSONPath, obj, obj3);
            if (obj4 == null) {
                return false;
            }
            String string = obj4.toString();
            if (string.length() < this.minLength) {
                return this.not;
            }
            String str = this.startsWithValue;
            if (str == null) {
                length = 0;
            } else {
                if (!string.startsWith(str)) {
                    return this.not;
                }
                length = this.startsWithValue.length();
            }
            String[] strArr = this.containsValues;
            if (strArr != null) {
                for (String str2 : strArr) {
                    int iIndexOf = string.indexOf(str2, length);
                    if (iIndexOf == -1) {
                        return this.not;
                    }
                    length = iIndexOf + str2.length();
                }
            }
            String str3 = this.endsWithValue;
            return (str3 == null || string.endsWith(str3)) ? !this.not : this.not;
        }
    }

    public static class MaxSegment implements Segment {
        public static final MaxSegment instance = new MaxSegment();

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            if (!(obj2 instanceof Collection)) {
                throw new UnsupportedOperationException();
            }
            Object obj3 = null;
            for (Object obj4 : (Collection) obj2) {
                if (obj4 != null && (obj3 == null || JSONPath.compare(obj3, obj4) < 0)) {
                    obj3 = obj4;
                }
            }
            return obj3;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            throw new UnsupportedOperationException();
        }
    }

    public static class MinSegment implements Segment {
        public static final MinSegment instance = new MinSegment();

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            if (!(obj2 instanceof Collection)) {
                throw new UnsupportedOperationException();
            }
            Object obj3 = null;
            for (Object obj4 : (Collection) obj2) {
                if (obj4 != null && (obj3 == null || JSONPath.compare(obj3, obj4) > 0)) {
                    obj3 = obj4;
                }
            }
            return obj3;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            throw new UnsupportedOperationException();
        }
    }

    public static class MultiIndexSegment implements Segment {
        private final int[] indexes;

        public MultiIndexSegment(int[] iArr) {
            this.indexes = iArr;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            JSONArray jSONArray = new JSONArray(this.indexes.length);
            int i10 = 0;
            while (true) {
                int[] iArr = this.indexes;
                if (i10 >= iArr.length) {
                    return jSONArray;
                }
                jSONArray.add(jSONPath.getArrayItem(obj2, iArr[i10]));
                i10++;
            }
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            if (context.eval) {
                Object obj = defaultJSONParser.parse();
                if (obj instanceof List) {
                    int[] iArr = this.indexes;
                    int length = iArr.length;
                    int[] iArr2 = new int[length];
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    List list = (List) obj;
                    if (iArr2[0] >= 0) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            if (Arrays.binarySearch(iArr2, size) < 0) {
                                list.remove(size);
                            }
                        }
                        context.object = list;
                        return;
                    }
                }
            }
            throw new UnsupportedOperationException();
        }
    }

    public static class MultiPropertySegment implements Segment {
        private final String[] propertyNames;
        private final long[] propertyNamesHash;

        public MultiPropertySegment(String[] strArr) {
            this.propertyNames = strArr;
            this.propertyNamesHash = new long[strArr.length];
            int i10 = 0;
            while (true) {
                long[] jArr = this.propertyNamesHash;
                if (i10 >= jArr.length) {
                    return;
                }
                jArr[i10] = TypeUtils.fnv1a_64(strArr[i10]);
                i10++;
            }
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            ArrayList arrayList = new ArrayList(this.propertyNames.length);
            int i10 = 0;
            while (true) {
                String[] strArr = this.propertyNames;
                if (i10 >= strArr.length) {
                    return arrayList;
                }
                arrayList.add(jSONPath.getPropertyValue(obj2, strArr[i10], this.propertyNamesHash[i10]));
                i10++;
            }
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) throws NumberFormatException {
            JSONArray jSONArray;
            Object objIntegerValue;
            JSONLexerBase jSONLexerBase = (JSONLexerBase) defaultJSONParser.lexer;
            Object obj = context.object;
            if (obj == null) {
                jSONArray = new JSONArray();
                context.object = jSONArray;
            } else {
                jSONArray = (JSONArray) obj;
            }
            for (int size = jSONArray.size(); size < this.propertyNamesHash.length; size++) {
                jSONArray.add(null);
            }
            do {
                int iSeekObjectToField = jSONLexerBase.seekObjectToField(this.propertyNamesHash);
                if (jSONLexerBase.matchStat != 3) {
                    return;
                }
                int i10 = jSONLexerBase.token();
                if (i10 == 2) {
                    objIntegerValue = jSONLexerBase.integerValue();
                    jSONLexerBase.nextToken(16);
                } else if (i10 == 3) {
                    objIntegerValue = jSONLexerBase.decimalValue();
                    jSONLexerBase.nextToken(16);
                } else if (i10 != 4) {
                    objIntegerValue = defaultJSONParser.parse();
                } else {
                    objIntegerValue = jSONLexerBase.stringVal();
                    jSONLexerBase.nextToken(16);
                }
                jSONArray.set(iSeekObjectToField, objIntegerValue);
            } while (jSONLexerBase.token() == 16);
        }
    }

    public static class NotNullSegement extends PropertyFilter {
        public NotNullSegement(String str, boolean z10) {
            super(str, z10);
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            return jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash) != null;
        }
    }

    public static class NullSegement extends PropertyFilter {
        public NullSegement(String str, boolean z10) {
            super(str, z10);
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            return get(jSONPath, obj, obj3) == null;
        }
    }

    public enum Operator {
        EQ,
        NE,
        GT,
        GE,
        LT,
        LE,
        LIKE,
        NOT_LIKE,
        RLIKE,
        NOT_RLIKE,
        IN,
        NOT_IN,
        BETWEEN,
        NOT_BETWEEN,
        And,
        Or,
        REG_MATCH
    }

    public static abstract class PropertyFilter implements Filter {
        static long TYPE = TypeUtils.fnv1a_64("type");
        protected final boolean function;
        protected Segment functionExpr;
        protected final String propertyName;
        protected final long propertyNameHash;

        public PropertyFilter(String str, boolean z10) {
            this.propertyName = str;
            long jFnv1a_64 = TypeUtils.fnv1a_64(str);
            this.propertyNameHash = jFnv1a_64;
            this.function = z10;
            if (z10) {
                if (jFnv1a_64 == TYPE) {
                    this.functionExpr = TypeSegment.instance;
                } else {
                    if (jFnv1a_64 == JSONPath.SIZE) {
                        this.functionExpr = SizeSegment.instance;
                        return;
                    }
                    throw new JSONPathException("unsupported funciton : " + str);
                }
            }
        }

        public Object get(JSONPath jSONPath, Object obj, Object obj2) {
            Segment segment = this.functionExpr;
            return segment != null ? segment.eval(jSONPath, obj, obj2) : jSONPath.getPropertyValue(obj2, this.propertyName, this.propertyNameHash);
        }
    }

    public static class PropertySegment implements Segment {
        private final boolean deep;
        private final String propertyName;
        private final long propertyNameHash;

        public PropertySegment(String str, boolean z10) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.deep = z10;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            if (!this.deep) {
                return jSONPath.getPropertyValue(obj2, this.propertyName, this.propertyNameHash);
            }
            ArrayList arrayList = new ArrayList();
            jSONPath.deepScan(obj2, this.propertyName, arrayList);
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:110:0x00b4 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
        @Override // com.alibaba.fastjson.JSONPath.Segment
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void extract(com.alibaba.fastjson.JSONPath r17, com.alibaba.fastjson.parser.DefaultJSONParser r18, com.alibaba.fastjson.JSONPath.Context r19) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSONPath.PropertySegment.extract(com.alibaba.fastjson.JSONPath, com.alibaba.fastjson.parser.DefaultJSONParser, com.alibaba.fastjson.JSONPath$Context):void");
        }

        public boolean remove(JSONPath jSONPath, Object obj) {
            return jSONPath.removePropertyValue(obj, this.propertyName, this.deep);
        }

        public void setValue(JSONPath jSONPath, Object obj, Object obj2) {
            if (this.deep) {
                jSONPath.deepSet(obj, this.propertyName, this.propertyNameHash, obj2);
            } else {
                jSONPath.setPropertyValue(obj, this.propertyName, this.propertyNameHash, obj2);
            }
        }
    }

    public static class RangeSegment implements Segment {
        private final int end;
        private final int start;
        private final int step;

        public RangeSegment(int i10, int i11, int i12) {
            this.start = i10;
            this.end = i11;
            this.step = i12;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            int iIntValue = SizeSegment.instance.eval(jSONPath, obj, obj2).intValue();
            int i10 = this.start;
            if (i10 < 0) {
                i10 += iIntValue;
            }
            int i11 = this.end;
            if (i11 < 0) {
                i11 += iIntValue;
            }
            int i12 = ((i11 - i10) / this.step) + 1;
            if (i12 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i12);
            while (i10 <= i11 && i10 < iIntValue) {
                arrayList.add(jSONPath.getArrayItem(obj2, i10));
                i10 += this.step;
            }
            return arrayList;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            throw new UnsupportedOperationException();
        }
    }

    public static class RefOpSegement extends PropertyFilter {

        /* renamed from: op */
        private final Operator f3974op;
        private final Segment refSgement;

        public RefOpSegement(String str, boolean z10, Segment segment, Operator operator) {
            super(str, z10);
            this.refSgement = segment;
            this.f3974op = operator;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object obj4 = get(jSONPath, obj, obj3);
            if (obj4 == null || !(obj4 instanceof Number)) {
                return false;
            }
            Object objEval = this.refSgement.eval(jSONPath, obj, obj);
            if ((objEval instanceof Integer) || (objEval instanceof Long) || (objEval instanceof Short) || (objEval instanceof Byte)) {
                long jLongExtractValue = TypeUtils.longExtractValue((Number) objEval);
                if ((obj4 instanceof Integer) || (obj4 instanceof Long) || (obj4 instanceof Short) || (obj4 instanceof Byte)) {
                    long jLongExtractValue2 = TypeUtils.longExtractValue((Number) obj4);
                    switch (C55141.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3974op.ordinal()]) {
                        case 1:
                            return jLongExtractValue2 == jLongExtractValue;
                        case 2:
                            return jLongExtractValue2 != jLongExtractValue;
                        case 3:
                            return jLongExtractValue2 >= jLongExtractValue;
                        case 4:
                            return jLongExtractValue2 > jLongExtractValue;
                        case 5:
                            return jLongExtractValue2 <= jLongExtractValue;
                        case 6:
                            return jLongExtractValue2 < jLongExtractValue;
                    }
                }
                if (obj4 instanceof BigDecimal) {
                    int iCompareTo = BigDecimal.valueOf(jLongExtractValue).compareTo((BigDecimal) obj4);
                    switch (C55141.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3974op.ordinal()]) {
                        case 1:
                            return iCompareTo == 0;
                        case 2:
                            return iCompareTo != 0;
                        case 3:
                            return iCompareTo <= 0;
                        case 4:
                            return iCompareTo < 0;
                        case 5:
                            return iCompareTo >= 0;
                        case 6:
                            return iCompareTo > 0;
                        default:
                            return false;
                    }
                }
            }
            throw new UnsupportedOperationException();
        }
    }

    public static class RegMatchSegement extends PropertyFilter {

        /* renamed from: op */
        private final Operator f3975op;
        private final Pattern pattern;

        public RegMatchSegement(String str, boolean z10, Pattern pattern, Operator operator) {
            super(str, z10);
            this.pattern = pattern;
            this.f3975op = operator;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object obj4 = get(jSONPath, obj, obj3);
            if (obj4 == null) {
                return false;
            }
            return this.pattern.matcher(obj4.toString()).matches();
        }
    }

    public static class RlikeSegement extends PropertyFilter {
        private final boolean not;
        private final Pattern pattern;

        public RlikeSegement(String str, boolean z10, String str2, boolean z11) {
            super(str, z10);
            this.pattern = Pattern.compile(str2);
            this.not = z11;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object obj4 = get(jSONPath, obj, obj3);
            if (obj4 == null) {
                return false;
            }
            boolean zMatches = this.pattern.matcher(obj4.toString()).matches();
            return this.not ? !zMatches : zMatches;
        }
    }

    public interface Segment {
        Object eval(JSONPath jSONPath, Object obj, Object obj2);

        void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context);
    }

    public static class SizeSegment implements Segment {
        public static final SizeSegment instance = new SizeSegment();

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            context.object = Integer.valueOf(jSONPath.evalSize(defaultJSONParser.parse()));
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Integer eval(JSONPath jSONPath, Object obj, Object obj2) {
            return Integer.valueOf(jSONPath.evalSize(obj2));
        }
    }

    public static class StringInSegement extends PropertyFilter {
        private final boolean not;
        private final String[] values;

        public StringInSegement(String str, boolean z10, String[] strArr, boolean z11) {
            super(str, z10);
            this.values = strArr;
            this.not = z11;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            boolean z10;
            Object obj4 = get(jSONPath, obj, obj3);
            for (String str : this.values) {
                if (str == obj4) {
                    z10 = this.not;
                } else if (str != null && str.equals(obj4)) {
                    z10 = this.not;
                }
                return !z10;
            }
            return this.not;
        }
    }

    public static class StringOpSegement extends PropertyFilter {

        /* renamed from: op */
        private final Operator f3976op;
        private final String value;

        public StringOpSegement(String str, boolean z10, String str2, Operator operator) {
            super(str, z10);
            this.value = str2;
            this.f3976op = operator;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object obj4 = get(jSONPath, obj, obj3);
            Operator operator = this.f3976op;
            if (operator == Operator.EQ) {
                return this.value.equals(obj4);
            }
            if (operator == Operator.NE) {
                return !this.value.equals(obj4);
            }
            if (obj4 == null) {
                return false;
            }
            int iCompareTo = this.value.compareTo(obj4.toString());
            Operator operator2 = this.f3976op;
            return operator2 == Operator.GE ? iCompareTo <= 0 : operator2 == Operator.GT ? iCompareTo < 0 : operator2 == Operator.LE ? iCompareTo >= 0 : operator2 == Operator.LT && iCompareTo > 0;
        }
    }

    public static class TypeSegment implements Segment {
        public static final TypeSegment instance = new TypeSegment();

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public String eval(JSONPath jSONPath, Object obj, Object obj2) {
            return obj2 == null ? "null" : obj2 instanceof Collection ? "array" : obj2 instanceof Number ? "number" : obj2 instanceof Boolean ? TypedValues.Custom.S_BOOLEAN : ((obj2 instanceof String) || (obj2 instanceof UUID) || (obj2 instanceof Enum)) ? TypedValues.Custom.S_STRING : "object";
        }
    }

    public static class ValueSegment extends PropertyFilter {

        /* renamed from: eq */
        private boolean f3977eq;
        private final Object value;

        public ValueSegment(String str, boolean z10, Object obj, boolean z11) {
            super(str, z10);
            this.f3977eq = true;
            if (obj == null) {
                throw new IllegalArgumentException("value is null");
            }
            this.value = obj;
            this.f3977eq = z11;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            boolean zEquals = this.value.equals(get(jSONPath, obj, obj3));
            return !this.f3977eq ? !zEquals : zEquals;
        }
    }

    public static class WildCardSegment implements Segment {
        public static final WildCardSegment instance = new WildCardSegment(false);
        public static final WildCardSegment instance_deep = new WildCardSegment(true);
        private boolean deep;

        private WildCardSegment(boolean z10) {
            this.deep = z10;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            if (!this.deep) {
                return jSONPath.getPropertyValues(obj2);
            }
            ArrayList arrayList = new ArrayList();
            jSONPath.deepGetPropertyValues(obj2, arrayList);
            return arrayList;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            if (context.eval) {
                Object obj = defaultJSONParser.parse();
                if (this.deep) {
                    ArrayList arrayList = new ArrayList();
                    jSONPath.deepGetPropertyValues(obj, arrayList);
                    context.object = arrayList;
                    return;
                } else {
                    if (obj instanceof JSONObject) {
                        Collection<?> collectionValues = ((JSONObject) obj).values();
                        JSONArray jSONArray = new JSONArray(collectionValues.size());
                        jSONArray.addAll(collectionValues);
                        context.object = jSONArray;
                        return;
                    }
                    if (obj instanceof JSONArray) {
                        context.object = obj;
                        return;
                    }
                }
            }
            throw new JSONException("TODO");
        }
    }

    public JSONPath(String str) {
        this(str, SerializeConfig.getGlobalInstance(), ParserConfig.getGlobalInstance());
    }

    public static int compare(Object obj, Object obj2) {
        Object d10;
        Object f10;
        if (obj.getClass() == obj2.getClass()) {
            return ((Comparable) obj).compareTo(obj2);
        }
        Class<?> cls = obj.getClass();
        Class<?> cls2 = obj2.getClass();
        if (cls == BigDecimal.class) {
            if (cls2 == Integer.class) {
                f10 = new BigDecimal(((Integer) obj2).intValue());
            } else if (cls2 == Long.class) {
                f10 = new BigDecimal(((Long) obj2).longValue());
            } else if (cls2 == Float.class) {
                f10 = new BigDecimal(((Float) obj2).floatValue());
            } else if (cls2 == Double.class) {
                f10 = new BigDecimal(((Double) obj2).doubleValue());
            }
            obj2 = f10;
        } else if (cls == Long.class) {
            if (cls2 == Integer.class) {
                f10 = new Long(((Integer) obj2).intValue());
                obj2 = f10;
            } else {
                if (cls2 == BigDecimal.class) {
                    d10 = new BigDecimal(((Long) obj).longValue());
                } else if (cls2 == Float.class) {
                    d10 = new Float(((Long) obj).longValue());
                } else if (cls2 == Double.class) {
                    d10 = new Double(((Long) obj).longValue());
                }
                obj = d10;
            }
        } else if (cls == Integer.class) {
            if (cls2 == Long.class) {
                d10 = new Long(((Integer) obj).intValue());
            } else if (cls2 == BigDecimal.class) {
                d10 = new BigDecimal(((Integer) obj).intValue());
            } else if (cls2 == Float.class) {
                d10 = new Float(((Integer) obj).intValue());
            } else if (cls2 == Double.class) {
                d10 = new Double(((Integer) obj).intValue());
            }
            obj = d10;
        } else if (cls == Double.class) {
            if (cls2 == Integer.class) {
                f10 = new Double(((Integer) obj2).intValue());
            } else if (cls2 == Long.class) {
                f10 = new Double(((Long) obj2).longValue());
            } else if (cls2 == Float.class) {
                f10 = new Double(((Float) obj2).floatValue());
            }
            obj2 = f10;
        } else if (cls == Float.class) {
            if (cls2 == Integer.class) {
                f10 = new Float(((Integer) obj2).intValue());
            } else if (cls2 == Long.class) {
                f10 = new Float(((Long) obj2).longValue());
            } else if (cls2 == Double.class) {
                d10 = new Double(((Float) obj).floatValue());
                obj = d10;
            }
            obj2 = f10;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    public static JSONPath compile(String str) {
        if (str == null) {
            throw new JSONPathException("jsonpath can not be null");
        }
        JSONPath jSONPath = pathCache.get(str);
        if (jSONPath == null) {
            jSONPath = new JSONPath(str);
            if (pathCache.size() < 1024) {
                pathCache.putIfAbsent(str, jSONPath);
                return pathCache.get(str);
            }
        }
        return jSONPath;
    }

    /* renamed from: eq */
    public static boolean m3329eq(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (obj.getClass() == obj2.getClass()) {
            return obj.equals(obj2);
        }
        if (!(obj instanceof Number)) {
            return obj.equals(obj2);
        }
        if (obj2 instanceof Number) {
            return eqNotNull((Number) obj, (Number) obj2);
        }
        return false;
    }

    public static boolean eqNotNull(Number number, Number number2) {
        Class<?> cls = number.getClass();
        boolean zIsInt = isInt(cls);
        Class<?> cls2 = number2.getClass();
        boolean zIsInt2 = isInt(cls2);
        if (number instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) number;
            if (zIsInt2) {
                return bigDecimal.equals(BigDecimal.valueOf(TypeUtils.longExtractValue(number2)));
            }
        }
        if (zIsInt) {
            if (zIsInt2) {
                return number.longValue() == number2.longValue();
            }
            if (number2 instanceof BigInteger) {
                return BigInteger.valueOf(number.longValue()).equals((BigInteger) number);
            }
        }
        if (zIsInt2 && (number instanceof BigInteger)) {
            return ((BigInteger) number).equals(BigInteger.valueOf(TypeUtils.longExtractValue(number2)));
        }
        boolean zIsDouble = isDouble(cls);
        boolean zIsDouble2 = isDouble(cls2);
        return ((zIsDouble && zIsDouble2) || ((zIsDouble && zIsInt2) || (zIsDouble2 && zIsInt))) && number.doubleValue() == number2.doubleValue();
    }

    public static boolean isDouble(Class<?> cls) {
        return cls == Float.class || cls == Double.class;
    }

    public static boolean isInt(Class<?> cls) {
        return cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class;
    }

    public static Map<String, Object> paths(Object obj) {
        return paths(obj, SerializeConfig.globalInstance);
    }

    public static Object read(String str, String str2) {
        return compile(str2).eval(JSON.parse(str));
    }

    public static Object reserveToArray(Object obj, String... strArr) {
        JSONArray jSONArray = new JSONArray();
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                JSONPath jSONPathCompile = compile(str);
                jSONPathCompile.init();
                jSONArray.add(jSONPathCompile.eval(obj));
            }
        }
        return jSONArray;
    }

    public static Object reserveToObject(Object obj, String... strArr) {
        Object objEval;
        if (strArr == null || strArr.length == 0) {
            return obj;
        }
        JSONObject jSONObject = new JSONObject(true);
        for (String str : strArr) {
            JSONPath jSONPathCompile = compile(str);
            jSONPathCompile.init();
            Segment[] segmentArr = jSONPathCompile.segments;
            if ((segmentArr[segmentArr.length - 1] instanceof PropertySegment) && (objEval = jSONPathCompile.eval(obj)) != null) {
                jSONPathCompile.set(jSONObject, objEval);
            }
        }
        return jSONObject;
    }

    public void arrayAdd(Object obj, Object... objArr) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (objArr == null || objArr.length == 0 || obj == null) {
            return;
        }
        init();
        int i10 = 0;
        Object obj2 = null;
        Object objEval = obj;
        int i11 = 0;
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i11 >= segmentArr.length) {
                break;
            }
            if (i11 == segmentArr.length - 1) {
                obj2 = objEval;
            }
            objEval = segmentArr[i11].eval(this, obj, objEval);
            i11++;
        }
        if (objEval == null) {
            throw new JSONPathException("value not found in path " + this.path);
        }
        if (objEval instanceof Collection) {
            Collection collection = (Collection) objEval;
            int length = objArr.length;
            while (i10 < length) {
                collection.add(objArr[i10]);
                i10++;
            }
            return;
        }
        Class<?> cls = objEval.getClass();
        if (!cls.isArray()) {
            throw new JSONException("unsupported array put operation. " + cls);
        }
        int length2 = Array.getLength(objEval);
        Object objNewInstance = Array.newInstance(cls.getComponentType(), objArr.length + length2);
        System.arraycopy(objEval, 0, objNewInstance, 0, length2);
        while (i10 < objArr.length) {
            Array.set(objNewInstance, length2 + i10, objArr[i10]);
            i10++;
        }
        Segment segment = this.segments[r8.length - 1];
        if (segment instanceof PropertySegment) {
            ((PropertySegment) segment).setValue(this, obj2, objNewInstance);
        } else {
            if (!(segment instanceof ArrayAccessSegment)) {
                throw new UnsupportedOperationException();
            }
            ((ArrayAccessSegment) segment).setValue(this, obj2, objNewInstance);
        }
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        init();
        Object obj2 = obj;
        int i10 = 0;
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i10 >= segmentArr.length) {
                return true;
            }
            Object objEval = segmentArr[i10].eval(this, obj, obj2);
            if (objEval == null) {
                return false;
            }
            if (objEval == Collections.EMPTY_LIST && (obj2 instanceof List)) {
                return ((List) obj2).contains(objEval);
            }
            i10++;
            obj2 = objEval;
        }
    }

    public boolean containsValue(Object obj, Object obj2) {
        Object objEval = eval(obj);
        if (objEval == obj2) {
            return true;
        }
        if (objEval == null) {
            return false;
        }
        if (!(objEval instanceof Iterable)) {
            return m3329eq(objEval, obj2);
        }
        Iterator it = ((Iterable) objEval).iterator();
        while (it.hasNext()) {
            if (m3329eq(it.next(), obj2)) {
                return true;
            }
        }
        return false;
    }

    public void deepGetPropertyValues(Object obj, List<Object> list) {
        Collection fieldValues;
        Class<?> cls = obj.getClass();
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(cls);
        if (javaBeanSerializer != null) {
            try {
                fieldValues = javaBeanSerializer.getFieldValues(obj);
            } catch (Exception e10) {
                throw new JSONPathException("jsonpath error, path " + this.path, e10);
            }
        } else {
            fieldValues = obj instanceof Map ? ((Map) obj).values() : obj instanceof Collection ? (Collection) obj : null;
        }
        if (fieldValues == null) {
            throw new UnsupportedOperationException(cls.getName());
        }
        for (Object obj2 : fieldValues) {
            if (obj2 == null || ParserConfig.isPrimitive2(obj2.getClass())) {
                list.add(obj2);
            } else {
                deepGetPropertyValues(obj2, list);
            }
        }
    }

    public void deepScan(Object obj, String str, List<Object> list) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object value = entry.getValue();
                if (str.equals(entry.getKey())) {
                    if (value instanceof Collection) {
                        list.addAll((Collection) value);
                    } else {
                        list.add(value);
                    }
                } else if (value != null && !ParserConfig.isPrimitive2(value.getClass())) {
                    deepScan(value, str, list);
                }
            }
            return;
        }
        if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                if (!ParserConfig.isPrimitive2(obj2.getClass())) {
                    deepScan(obj2, str, list);
                }
            }
            return;
        }
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(obj.getClass());
        if (javaBeanSerializer == null) {
            if (obj instanceof List) {
                List list2 = (List) obj;
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    deepScan(list2.get(i10), str, list);
                }
                return;
            }
            return;
        }
        try {
            FieldSerializer fieldSerializer = javaBeanSerializer.getFieldSerializer(str);
            if (fieldSerializer == null) {
                Iterator<Object> it = javaBeanSerializer.getFieldValues(obj).iterator();
                while (it.hasNext()) {
                    deepScan(it.next(), str, list);
                }
                return;
            }
            try {
                try {
                    list.add(fieldSerializer.getPropertyValueDirect(obj));
                } catch (InvocationTargetException e10) {
                    throw new JSONException("getFieldValue error." + str, e10);
                }
            } catch (IllegalAccessException e11) {
                throw new JSONException("getFieldValue error." + str, e11);
            }
        } catch (Exception e12) {
            throw new JSONPathException("jsonpath error, path " + this.path + ", segement " + str, e12);
        }
    }

    public void deepSet(Object obj, String str, long j10, Object obj2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey(str)) {
                map.get(str);
                map.put(str, obj2);
                return;
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                String str2 = str;
                long j11 = j10;
                Object obj3 = obj2;
                deepSet(it.next(), str2, j11, obj3);
                str = str2;
                j10 = j11;
                obj2 = obj3;
            }
            return;
        }
        JSONPath jSONPath = this;
        Class<?> cls = obj.getClass();
        JavaBeanDeserializer javaBeanDeserializer = getJavaBeanDeserializer(cls);
        if (javaBeanDeserializer == null) {
            if (obj instanceof List) {
                List list = (List) obj;
                int i10 = 0;
                while (i10 < list.size()) {
                    jSONPath.deepSet(list.get(i10), str, j10, obj2);
                    i10++;
                    jSONPath = this;
                }
                return;
            }
            return;
        }
        try {
            FieldDeserializer fieldDeserializer = javaBeanDeserializer.getFieldDeserializer(str);
            if (fieldDeserializer != null) {
                fieldDeserializer.setValue(obj, obj2);
                return;
            }
            Iterator<Object> it2 = getJavaBeanSerializer(cls).getObjectFieldValues(obj).iterator();
            while (it2.hasNext()) {
                jSONPath.deepSet(it2.next(), str, j10, obj2);
            }
        } catch (Exception e10) {
            throw new JSONPathException("jsonpath error, path " + jSONPath.path + ", segement " + str, e10);
        }
    }

    public Object eval(Object obj) {
        if (obj == null) {
            return null;
        }
        init();
        int i10 = 0;
        Object objEval = obj;
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i10 >= segmentArr.length) {
                return objEval;
            }
            objEval = segmentArr[i10].eval(this, obj, objEval);
            i10++;
        }
    }

    public Set<?> evalKeySet(Object obj) {
        JavaBeanSerializer javaBeanSerializer;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).keySet();
        }
        if ((obj instanceof Collection) || (obj instanceof Object[]) || obj.getClass().isArray() || (javaBeanSerializer = getJavaBeanSerializer(obj.getClass())) == null) {
            return null;
        }
        try {
            return javaBeanSerializer.getFieldNames(obj);
        } catch (Exception e10) {
            throw new JSONPathException("evalKeySet error : " + this.path, e10);
        }
    }

    public int evalSize(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj).length;
        }
        if (obj.getClass().isArray()) {
            return Array.getLength(obj);
        }
        if (obj instanceof Map) {
            Iterator it = ((Map) obj).values().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (it.next() != null) {
                    i10++;
                }
            }
            return i10;
        }
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(obj.getClass());
        if (javaBeanSerializer == null) {
            return -1;
        }
        try {
            return javaBeanSerializer.getSize(obj);
        } catch (Exception e10) {
            throw new JSONPathException("evalSize error : " + this.path, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object extract(com.alibaba.fastjson.parser.DefaultJSONParser r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            r9.init()
            boolean r1 = r9.hasRefSegment
            if (r1 == 0) goto L14
            java.lang.Object r10 = r10.parse()
            java.lang.Object r10 = r9.eval(r10)
            return r10
        L14:
            com.alibaba.fastjson.JSONPath$Segment[] r1 = r9.segments
            int r2 = r1.length
            if (r2 != 0) goto L1e
            java.lang.Object r10 = r10.parse()
            return r10
        L1e:
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            r1 = r1[r2]
            boolean r2 = r1 instanceof com.alibaba.fastjson.JSONPath.TypeSegment
            if (r2 != 0) goto Laa
            boolean r2 = r1 instanceof com.alibaba.fastjson.JSONPath.FloorSegment
            if (r2 != 0) goto Laa
            boolean r1 = r1 instanceof com.alibaba.fastjson.JSONPath.MultiIndexSegment
            if (r1 == 0) goto L31
            goto Laa
        L31:
            r1 = 0
            r4 = r0
            r2 = r1
        L34:
            com.alibaba.fastjson.JSONPath$Segment[] r5 = r9.segments
            int r6 = r5.length
            if (r2 >= r6) goto La7
            r6 = r5[r2]
            int r7 = r5.length
            int r7 = r7 - r3
            if (r2 != r7) goto L41
            r7 = r3
            goto L42
        L41:
            r7 = r1
        L42:
            if (r4 == 0) goto L4f
            java.lang.Object r8 = r4.object
            if (r8 == 0) goto L4f
            java.lang.Object r5 = r6.eval(r9, r0, r8)
            r4.object = r5
            goto La4
        L4f:
            if (r7 != 0) goto L9a
            int r7 = r2 + 1
            r5 = r5[r7]
            boolean r7 = r6 instanceof com.alibaba.fastjson.JSONPath.PropertySegment
            if (r7 == 0) goto L7b
            r7 = r6
            com.alibaba.fastjson.JSONPath$PropertySegment r7 = (com.alibaba.fastjson.JSONPath.PropertySegment) r7
            boolean r7 = com.alibaba.fastjson.JSONPath.PropertySegment.access$100(r7)
            if (r7 == 0) goto L7b
            boolean r7 = r5 instanceof com.alibaba.fastjson.JSONPath.ArrayAccessSegment
            if (r7 != 0) goto L9a
            boolean r7 = r5 instanceof com.alibaba.fastjson.JSONPath.MultiIndexSegment
            if (r7 != 0) goto L9a
            boolean r7 = r5 instanceof com.alibaba.fastjson.JSONPath.MultiPropertySegment
            if (r7 != 0) goto L9a
            boolean r7 = r5 instanceof com.alibaba.fastjson.JSONPath.SizeSegment
            if (r7 != 0) goto L9a
            boolean r7 = r5 instanceof com.alibaba.fastjson.JSONPath.PropertySegment
            if (r7 != 0) goto L9a
            boolean r7 = r5 instanceof com.alibaba.fastjson.JSONPath.FilterSegment
            if (r7 == 0) goto L7b
            goto L9a
        L7b:
            boolean r7 = r5 instanceof com.alibaba.fastjson.JSONPath.ArrayAccessSegment
            if (r7 == 0) goto L89
            r7 = r5
            com.alibaba.fastjson.JSONPath$ArrayAccessSegment r7 = (com.alibaba.fastjson.JSONPath.ArrayAccessSegment) r7
            int r7 = com.alibaba.fastjson.JSONPath.ArrayAccessSegment.access$200(r7)
            if (r7 >= 0) goto L89
            goto L9a
        L89:
            boolean r5 = r5 instanceof com.alibaba.fastjson.JSONPath.FilterSegment
            if (r5 == 0) goto L8e
            goto L9a
        L8e:
            boolean r5 = r6 instanceof com.alibaba.fastjson.JSONPath.WildCardSegment
            if (r5 == 0) goto L93
            goto L9a
        L93:
            boolean r5 = r6 instanceof com.alibaba.fastjson.JSONPath.MultiIndexSegment
            if (r5 == 0) goto L98
            goto L9a
        L98:
            r5 = r1
            goto L9b
        L9a:
            r5 = r3
        L9b:
            com.alibaba.fastjson.JSONPath$Context r7 = new com.alibaba.fastjson.JSONPath$Context
            r7.<init>(r4, r5)
            r6.extract(r9, r10, r7)
            r4 = r7
        La4:
            int r2 = r2 + 1
            goto L34
        La7:
            java.lang.Object r10 = r4.object
            return r10
        Laa:
            java.lang.Object r10 = r10.parse()
            java.lang.Object r10 = r9.eval(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSONPath.extract(com.alibaba.fastjson.parser.DefaultJSONParser):java.lang.Object");
    }

    public Object getArrayItem(Object obj, int i10) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (i10 >= 0) {
                if (i10 < list.size()) {
                    return list.get(i10);
                }
                return null;
            }
            if (Math.abs(i10) <= list.size()) {
                return list.get(list.size() + i10);
            }
            return null;
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            if (i10 >= 0) {
                if (i10 < length) {
                    return Array.get(obj, i10);
                }
                return null;
            }
            if (Math.abs(i10) <= length) {
                return Array.get(obj, length + i10);
            }
            return null;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(Integer.valueOf(i10));
            return obj2 == null ? map.get(Integer.toString(i10)) : obj2;
        }
        if (!(obj instanceof Collection)) {
            if (i10 == 0) {
                return obj;
            }
            throw new UnsupportedOperationException();
        }
        int i11 = 0;
        for (Object obj3 : (Collection) obj) {
            if (i11 == i10) {
                return obj3;
            }
            i11++;
        }
        return null;
    }

    public JavaBeanDeserializer getJavaBeanDeserializer(Class<?> cls) {
        ObjectDeserializer deserializer = this.parserConfig.getDeserializer(cls);
        if (deserializer instanceof JavaBeanDeserializer) {
            return (JavaBeanDeserializer) deserializer;
        }
        return null;
    }

    public JavaBeanSerializer getJavaBeanSerializer(Class<?> cls) {
        ObjectSerializer objectWriter = this.serializeConfig.getObjectWriter(cls);
        if (objectWriter instanceof JavaBeanSerializer) {
            return (JavaBeanSerializer) objectWriter;
        }
        return null;
    }

    public String getPath() {
        return this.path;
    }

    public Object getPropertyValue(Object obj, String str, long j10) {
        JSONArray jSONArray = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            try {
                obj = JSON.parseObject((String) obj);
            } catch (Exception unused) {
            }
        }
        Object obj2 = obj;
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get(str);
            return obj3 == null ? (SIZE == j10 || LENGTH == j10) ? Integer.valueOf(map.size()) : obj3 : obj3;
        }
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(obj2.getClass());
        if (javaBeanSerializer != null) {
            try {
                return javaBeanSerializer.getFieldValue(obj2, str, j10, false);
            } catch (Exception e10) {
                throw new JSONPathException("jsonpath error, path " + this.path + ", segement " + str, e10);
            }
        }
        int i10 = 0;
        if (obj2 instanceof List) {
            List list = (List) obj2;
            if (SIZE == j10 || LENGTH == j10) {
                return Integer.valueOf(list.size());
            }
            while (i10 < list.size()) {
                Object obj4 = list.get(i10);
                if (obj4 == list) {
                    if (jSONArray == null) {
                        jSONArray = new JSONArray(list.size());
                    }
                    jSONArray.add(obj4);
                } else {
                    Object propertyValue = getPropertyValue(obj4, str, j10);
                    if (propertyValue instanceof Collection) {
                        Collection collection = (Collection) propertyValue;
                        if (jSONArray == null) {
                            jSONArray = new JSONArray(list.size());
                        }
                        jSONArray.addAll(collection);
                    } else if (propertyValue != null) {
                        if (jSONArray == null) {
                            jSONArray = new JSONArray(list.size());
                        }
                        jSONArray.add(propertyValue);
                    }
                }
                i10++;
            }
            return jSONArray == null ? Collections.EMPTY_LIST : jSONArray;
        }
        if (obj2 instanceof Object[]) {
            Object[] objArr = (Object[]) obj2;
            if (SIZE == j10 || LENGTH == j10) {
                return Integer.valueOf(objArr.length);
            }
            JSONArray jSONArray2 = new JSONArray(objArr.length);
            while (i10 < objArr.length) {
                Object[] objArr2 = objArr[i10];
                if (objArr2 == objArr) {
                    jSONArray2.add(objArr2);
                } else {
                    Object propertyValue2 = getPropertyValue(objArr2, str, j10);
                    if (propertyValue2 instanceof Collection) {
                        jSONArray2.addAll((Collection) propertyValue2);
                    } else if (propertyValue2 != null) {
                        jSONArray2.add(propertyValue2);
                    }
                }
                i10++;
            }
            return jSONArray2;
        }
        if (obj2 instanceof Enum) {
            Enum r82 = (Enum) obj2;
            if (-4270347329889690746L == j10) {
                return r82.name();
            }
            if (-1014497654951707614L == j10) {
                return Integer.valueOf(r82.ordinal());
            }
        }
        if (obj2 instanceof Calendar) {
            Calendar calendar = (Calendar) obj2;
            if (8963398325558730460L == j10) {
                return Integer.valueOf(calendar.get(1));
            }
            if (-811277319855450459L == j10) {
                return Integer.valueOf(calendar.get(2));
            }
            if (-3851359326990528739L == j10) {
                return Integer.valueOf(calendar.get(5));
            }
            if (4647432019745535567L == j10) {
                return Integer.valueOf(calendar.get(11));
            }
            if (6607618197526598121L == j10) {
                return Integer.valueOf(calendar.get(12));
            }
            if (-6586085717218287427L == j10) {
                return Integer.valueOf(calendar.get(13));
            }
        }
        return null;
    }

    public Collection<Object> getPropertyValues(Object obj) {
        if (obj == null) {
            return null;
        }
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(obj.getClass());
        if (javaBeanSerializer == null) {
            if (obj instanceof Map) {
                return ((Map) obj).values();
            }
            if (obj instanceof Collection) {
                return (Collection) obj;
            }
            throw new UnsupportedOperationException();
        }
        try {
            return javaBeanSerializer.getFieldValues(obj);
        } catch (Exception e10) {
            throw new JSONPathException("jsonpath error, path " + this.path, e10);
        }
    }

    public void init() {
        if (this.segments != null) {
            return;
        }
        if ("*".equals(this.path)) {
            this.segments = new Segment[]{WildCardSegment.instance};
            return;
        }
        JSONPathParser jSONPathParser = new JSONPathParser(this.path);
        this.segments = jSONPathParser.explain();
        this.hasRefSegment = jSONPathParser.hasRefSegment;
    }

    public boolean isRef() {
        try {
            init();
            int i10 = 0;
            while (true) {
                Segment[] segmentArr = this.segments;
                if (i10 >= segmentArr.length) {
                    return true;
                }
                Class<?> cls = segmentArr[i10].getClass();
                if (cls != ArrayAccessSegment.class && cls != PropertySegment.class) {
                    return false;
                }
                i10++;
            }
        } catch (JSONPathException unused) {
            return false;
        }
    }

    public Set<?> keySet(Object obj) {
        if (obj == null) {
            return null;
        }
        init();
        int i10 = 0;
        Object objEval = obj;
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i10 >= segmentArr.length) {
                return evalKeySet(objEval);
            }
            objEval = segmentArr[i10].eval(this, obj, objEval);
            i10++;
        }
    }

    public void patchAdd(Object obj, Object obj2, boolean z10) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (obj == null) {
            return;
        }
        init();
        int i10 = 0;
        Object obj3 = null;
        Object obj4 = obj;
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i10 >= segmentArr.length) {
                break;
            }
            Segment segment = segmentArr[i10];
            Object objEval = segment.eval(this, obj, obj4);
            if (objEval == null && i10 != this.segments.length - 1 && (segment instanceof PropertySegment)) {
                objEval = new JSONObject();
                ((PropertySegment) segment).setValue(this, obj4, objEval);
            }
            i10++;
            obj3 = obj4;
            obj4 = objEval;
        }
        if (!z10 && (obj4 instanceof Collection)) {
            ((Collection) obj4).add(obj2);
            return;
        }
        if (obj4 != null && !z10) {
            Class<?> cls = obj4.getClass();
            if (cls.isArray()) {
                int length = Array.getLength(obj4);
                Object objNewInstance = Array.newInstance(cls.getComponentType(), length + 1);
                System.arraycopy(obj4, 0, objNewInstance, 0, length);
                Array.set(objNewInstance, length, obj2);
                obj2 = objNewInstance;
            } else if (!Map.class.isAssignableFrom(cls)) {
                throw new JSONException("unsupported array put operation. " + cls);
            }
        }
        Segment segment2 = this.segments[r7.length - 1];
        if (segment2 instanceof PropertySegment) {
            ((PropertySegment) segment2).setValue(this, obj3, obj2);
        } else {
            if (!(segment2 instanceof ArrayAccessSegment)) {
                throw new UnsupportedOperationException();
            }
            ((ArrayAccessSegment) segment2).setValue(this, obj3, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        if (r4 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0090, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
    
        if ((r1 instanceof com.alibaba.fastjson.JSONPath.PropertySegment) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0095, code lost:
    
        r1 = (com.alibaba.fastjson.JSONPath.PropertySegment) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        if ((r4 instanceof java.util.Collection) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009b, code lost:
    
        r11 = r10.segments;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009e, code lost:
    
        if (r11.length <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
    
        r11 = r11[r11.length - 2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a7, code lost:
    
        if ((r11 instanceof com.alibaba.fastjson.JSONPath.RangeSegment) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ab, code lost:
    
        if ((r11 instanceof com.alibaba.fastjson.JSONPath.MultiIndexSegment) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ad, code lost:
    
        r11 = ((java.util.Collection) r4).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b7, code lost:
    
        if (r11.hasNext() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c1, code lost:
    
        if (r1.remove(r10, r11.next()) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c3, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ca, code lost:
    
        return r1.remove(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cd, code lost:
    
        if ((r1 instanceof com.alibaba.fastjson.JSONPath.ArrayAccessSegment) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d5, code lost:
    
        return ((com.alibaba.fastjson.JSONPath.ArrayAccessSegment) r1).remove(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d8, code lost:
    
        if ((r1 instanceof com.alibaba.fastjson.JSONPath.FilterSegment) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e0, code lost:
    
        return ((com.alibaba.fastjson.JSONPath.FilterSegment) r1).remove(r10, r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e6, code lost:
    
        throw new java.lang.UnsupportedOperationException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSONPath.remove(java.lang.Object):boolean");
    }

    public boolean removeArrayItem(JSONPath jSONPath, Object obj, int i10) {
        if (!(obj instanceof List)) {
            throw new JSONPathException("unsupported set operation." + obj.getClass());
        }
        List list = (List) obj;
        if (i10 >= 0) {
            if (i10 >= list.size()) {
                return false;
            }
            list.remove(i10);
            return true;
        }
        int size = list.size() + i10;
        if (size < 0) {
            return false;
        }
        list.remove(size);
        return true;
    }

    public boolean removePropertyValue(Object obj, String str, boolean z10) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            z = map.remove(str) != null;
            if (z10) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    removePropertyValue(it.next(), str, z10);
                }
            }
            return z;
        }
        ObjectDeserializer deserializer = this.parserConfig.getDeserializer(obj.getClass());
        JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
        if (javaBeanDeserializer == null) {
            if (z10) {
                return false;
            }
            throw new UnsupportedOperationException();
        }
        FieldDeserializer fieldDeserializer = javaBeanDeserializer.getFieldDeserializer(str);
        if (fieldDeserializer != null) {
            fieldDeserializer.setValue(obj, (String) null);
        } else {
            z = false;
        }
        if (z10) {
            for (Object obj2 : getPropertyValues(obj)) {
                if (obj2 != null) {
                    removePropertyValue(obj2, str, z10);
                }
            }
        }
        return z;
    }

    public boolean set(Object obj, Object obj2) {
        return set(obj, obj2, true);
    }

    public boolean setArrayItem(JSONPath jSONPath, Object obj, int i10, Object obj2) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj instanceof List) {
            List list = (List) obj;
            if (i10 >= 0) {
                list.set(i10, obj2);
            } else {
                list.set(list.size() + i10, obj2);
            }
            return true;
        }
        Class<?> cls = obj.getClass();
        if (!cls.isArray()) {
            throw new JSONPathException("unsupported set operation." + cls);
        }
        int length = Array.getLength(obj);
        if (i10 >= 0) {
            if (i10 < length) {
                Array.set(obj, i10, obj2);
            }
        } else if (Math.abs(i10) <= length) {
            Array.set(obj, length + i10, obj2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean setPropertyValue(java.lang.Object r9, java.lang.String r10, long r11, java.lang.Object r13) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof java.util.Map
            r1 = 1
            if (r0 == 0) goto Lb
            java.util.Map r9 = (java.util.Map) r9
            r9.put(r10, r13)
            return r1
        Lb:
            boolean r0 = r9 instanceof java.util.List
            if (r0 == 0) goto L2c
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
        L15:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r3 = r9.next()
            if (r3 != 0) goto L22
            goto L15
        L22:
            r2 = r8
            r4 = r10
            r5 = r11
            r7 = r13
            r2.setPropertyValue(r3, r4, r5, r7)
            goto L15
        L2a:
            r2 = r8
            return r1
        L2c:
            r2 = r8
            r5 = r11
            r7 = r13
            com.alibaba.fastjson.parser.ParserConfig r10 = r2.parserConfig
            java.lang.Class r11 = r9.getClass()
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r10 = r10.getDeserializer(r11)
            boolean r11 = r10 instanceof com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer
            if (r11 == 0) goto L40
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r10 = (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) r10
            goto L41
        L40:
            r10 = 0
        L41:
            if (r10 == 0) goto L65
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r10 = r10.getFieldDeserializer(r5)
            if (r10 != 0) goto L4b
            r9 = 0
            return r9
        L4b:
            if (r7 == 0) goto L60
            java.lang.Class r11 = r7.getClass()
            com.alibaba.fastjson.util.FieldInfo r12 = r10.fieldInfo
            java.lang.Class<?> r13 = r12.fieldClass
            if (r11 == r13) goto L60
            java.lang.reflect.Type r11 = r12.fieldType
            com.alibaba.fastjson.parser.ParserConfig r12 = r2.parserConfig
            java.lang.Object r13 = com.alibaba.fastjson.util.TypeUtils.cast(r7, r11, r12)
            goto L61
        L60:
            r13 = r7
        L61:
            r10.setValue(r9, r13)
            return r1
        L65:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSONPath.setPropertyValue(java.lang.Object, java.lang.String, long, java.lang.Object):boolean");
    }

    public int size(Object obj) {
        if (obj == null) {
            return -1;
        }
        init();
        int i10 = 0;
        Object objEval = obj;
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i10 >= segmentArr.length) {
                return evalSize(objEval);
            }
            objEval = segmentArr[i10].eval(this, obj, objEval);
            i10++;
        }
    }

    @Override // com.alibaba.fastjson.JSONAware
    public String toJSONString() {
        return JSON.toJSONString(this.path);
    }

    public JSONPath(String str, SerializeConfig serializeConfig, ParserConfig parserConfig) {
        if (str == null || str.length() == 0) {
            throw new JSONPathException("json-path can not be null or empty");
        }
        this.path = str;
        this.serializeConfig = serializeConfig;
        this.parserConfig = parserConfig;
    }

    public static Map<String, Object> paths(Object obj, SerializeConfig serializeConfig) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        HashMap map = new HashMap();
        paths(identityHashMap, map, MqttTopic.TOPIC_LEVEL_SEPARATOR, obj, serializeConfig);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean set(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r11 = 0
            if (r9 != 0) goto L4
            return r11
        L4:
            r8.init()
            r0 = 0
            r2 = r9
            r1 = r11
            r3 = r0
        Lb:
            com.alibaba.fastjson.JSONPath$Segment[] r4 = r8.segments
            int r5 = r4.length
            r6 = 1
            if (r1 >= r5) goto L86
            r3 = r4[r1]
            java.lang.Object r4 = r3.eval(r8, r9, r2)
            if (r4 != 0) goto L81
            com.alibaba.fastjson.JSONPath$Segment[] r4 = r8.segments
            int r5 = r4.length
            int r5 = r5 - r6
            if (r1 >= r5) goto L24
            int r5 = r1 + 1
            r4 = r4[r5]
            goto L25
        L24:
            r4 = r0
        L25:
            boolean r5 = r4 instanceof com.alibaba.fastjson.JSONPath.PropertySegment
            if (r5 == 0) goto L61
            boolean r4 = r3 instanceof com.alibaba.fastjson.JSONPath.PropertySegment
            if (r4 == 0) goto L4b
            r4 = r3
            com.alibaba.fastjson.JSONPath$PropertySegment r4 = (com.alibaba.fastjson.JSONPath.PropertySegment) r4
            java.lang.String r4 = com.alibaba.fastjson.JSONPath.PropertySegment.access$400(r4)
            java.lang.Class r5 = r2.getClass()
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r5 = r8.getJavaBeanDeserializer(r5)
            if (r5 == 0) goto L4b
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r4 = r5.getFieldDeserializer(r4)
            com.alibaba.fastjson.util.FieldInfo r4 = r4.fieldInfo
            java.lang.Class<?> r4 = r4.fieldClass
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r5 = r8.getJavaBeanDeserializer(r4)
            goto L4d
        L4b:
            r4 = r0
            r5 = r4
        L4d:
            if (r5 == 0) goto L5b
            com.alibaba.fastjson.util.JavaBeanInfo r7 = r5.beanInfo
            java.lang.reflect.Constructor<?> r7 = r7.defaultConstructor
            if (r7 == 0) goto L5a
            java.lang.Object r4 = r5.createInstance(r0, r4)
            goto L6c
        L5a:
            return r11
        L5b:
            com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject
            r4.<init>()
            goto L6c
        L61:
            boolean r4 = r4 instanceof com.alibaba.fastjson.JSONPath.ArrayAccessSegment
            if (r4 == 0) goto L6b
            com.alibaba.fastjson.JSONArray r4 = new com.alibaba.fastjson.JSONArray
            r4.<init>()
            goto L6c
        L6b:
            r4 = r0
        L6c:
            if (r4 == 0) goto L87
            boolean r5 = r3 instanceof com.alibaba.fastjson.JSONPath.PropertySegment
            if (r5 == 0) goto L78
            com.alibaba.fastjson.JSONPath$PropertySegment r3 = (com.alibaba.fastjson.JSONPath.PropertySegment) r3
            r3.setValue(r8, r2, r4)
            goto L81
        L78:
            boolean r5 = r3 instanceof com.alibaba.fastjson.JSONPath.ArrayAccessSegment
            if (r5 == 0) goto L87
            com.alibaba.fastjson.JSONPath$ArrayAccessSegment r3 = (com.alibaba.fastjson.JSONPath.ArrayAccessSegment) r3
            r3.setValue(r8, r2, r4)
        L81:
            int r1 = r1 + 1
            r3 = r2
            r2 = r4
            goto Lb
        L86:
            r2 = r3
        L87:
            if (r2 != 0) goto L8a
            return r11
        L8a:
            com.alibaba.fastjson.JSONPath$Segment[] r9 = r8.segments
            int r11 = r9.length
            int r11 = r11 - r6
            r9 = r9[r11]
            boolean r11 = r9 instanceof com.alibaba.fastjson.JSONPath.PropertySegment
            if (r11 == 0) goto L9a
            com.alibaba.fastjson.JSONPath$PropertySegment r9 = (com.alibaba.fastjson.JSONPath.PropertySegment) r9
            r9.setValue(r8, r2, r10)
            return r6
        L9a:
            boolean r11 = r9 instanceof com.alibaba.fastjson.JSONPath.ArrayAccessSegment
            if (r11 == 0) goto La5
            com.alibaba.fastjson.JSONPath$ArrayAccessSegment r9 = (com.alibaba.fastjson.JSONPath.ArrayAccessSegment) r9
            boolean r9 = r9.setValue(r8, r2, r10)
            return r9
        La5:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSONPath.set(java.lang.Object, java.lang.Object, boolean):boolean");
    }

    public static Object eval(Object obj, String str) {
        return compile(str).eval(obj);
    }

    public static Set<?> keySet(Object obj, String str) {
        JSONPath jSONPathCompile = compile(str);
        return jSONPathCompile.evalKeySet(jSONPathCompile.eval(obj));
    }

    private static void paths(Map<Object, String> map, Map<String, Object> map2, String str, Object obj, SerializeConfig serializeConfig) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        Class<?> cls;
        if (obj == null) {
            return;
        }
        if (map.put(obj, str) == null || (cls = obj.getClass()) == String.class || cls == Boolean.class || cls == Character.class || cls == UUID.class || cls.isEnum() || (obj instanceof Number) || (obj instanceof Date)) {
            map2.put(str, obj);
            if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (key instanceof String) {
                        if (str.equals(MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
                            sb5 = new StringBuilder();
                        } else {
                            sb5 = new StringBuilder();
                            sb5.append(str);
                        }
                        sb5.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
                        sb5.append(key);
                        paths(map, map2, sb5.toString(), entry.getValue(), serializeConfig);
                    }
                }
                return;
            }
            int i10 = 0;
            if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    if (str.equals(MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
                        sb4 = new StringBuilder();
                    } else {
                        sb4 = new StringBuilder();
                        sb4.append(str);
                    }
                    sb4.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
                    sb4.append(i10);
                    paths(map, map2, sb4.toString(), obj2, serializeConfig);
                    i10++;
                }
                return;
            }
            Class<?> cls2 = obj.getClass();
            if (cls2.isArray()) {
                int length = Array.getLength(obj);
                while (i10 < length) {
                    Object obj3 = Array.get(obj, i10);
                    if (str.equals(MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
                        sb3 = new StringBuilder();
                    } else {
                        sb3 = new StringBuilder();
                        sb3.append(str);
                    }
                    sb3.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
                    sb3.append(i10);
                    paths(map, map2, sb3.toString(), obj3, serializeConfig);
                    i10++;
                }
                return;
            }
            if (ParserConfig.isPrimitive2(cls2) || cls2.isEnum()) {
                return;
            }
            ObjectSerializer objectWriter = serializeConfig.getObjectWriter(cls2);
            if (objectWriter instanceof JavaBeanSerializer) {
                try {
                    for (Map.Entry<String, Object> entry2 : ((JavaBeanSerializer) objectWriter).getFieldValuesMap(obj).entrySet()) {
                        String key2 = entry2.getKey();
                        if (key2 != null) {
                            if (str.equals(MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
                                sb2 = new StringBuilder();
                                sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
                            } else {
                                sb2 = new StringBuilder();
                                sb2.append(str);
                                sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
                            }
                            sb2.append(key2);
                            paths(map, map2, sb2.toString(), entry2.getValue(), serializeConfig);
                        }
                    }
                } catch (Exception e10) {
                    throw new JSONException("toJSON error", e10);
                }
            }
        }
    }

    public static int size(Object obj, String str) {
        JSONPath jSONPathCompile = compile(str);
        return jSONPathCompile.evalSize(jSONPathCompile.eval(obj));
    }

    public static boolean contains(Object obj, String str) {
        if (obj == null) {
            return false;
        }
        return compile(str).contains(obj);
    }

    public static boolean containsValue(Object obj, String str, Object obj2) {
        return compile(str).containsValue(obj, obj2);
    }

    public static void arrayAdd(Object obj, String str, Object... objArr) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        compile(str).arrayAdd(obj, objArr);
    }

    public static Object extract(String str, String str2, ParserConfig parserConfig, int i10, Feature... featureArr) {
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, parserConfig, i10 | Feature.OrderedField.mask);
        Object objExtract = compile(str2).extract(defaultJSONParser);
        defaultJSONParser.lexer.close();
        return objExtract;
    }

    public static Object extract(String str, String str2) {
        return extract(str, str2, ParserConfig.global, JSON.DEFAULT_PARSER_FEATURE, new Feature[0]);
    }

    public static boolean set(Object obj, String str, Object obj2) {
        return compile(str).set(obj, obj2);
    }

    public static boolean remove(Object obj, String str) {
        return compile(str).remove(obj);
    }
}
