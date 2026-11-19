package androidx.constraintlayout.core.parser;

/* loaded from: classes2.dex */
public class CLParser {
    static boolean sDebug = false;
    private String mContent;
    private boolean mHasComment = false;
    private int mLineNumber;

    public enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public CLParser(String str) {
        this.mContent = str;
    }

    private CLElement createElement(CLElement cLElement, int i6, TYPE type, boolean z6, char[] cArr) {
        CLElement cLElementAllocate;
        if (sDebug) {
            System.out.println("CREATE " + type + " at " + cArr[i6]);
        }
        switch (type.ordinal()) {
            case 1:
                cLElementAllocate = CLObject.allocate(cArr);
                i6++;
                break;
            case 2:
                cLElementAllocate = CLArray.allocate(cArr);
                i6++;
                break;
            case 3:
                cLElementAllocate = CLNumber.allocate(cArr);
                break;
            case 4:
                cLElementAllocate = CLString.allocate(cArr);
                break;
            case 5:
                cLElementAllocate = CLKey.allocate(cArr);
                break;
            case 6:
                cLElementAllocate = CLToken.allocate(cArr);
                break;
            default:
                cLElementAllocate = null;
                break;
        }
        if (cLElementAllocate == null) {
            return null;
        }
        cLElementAllocate.setLine(this.mLineNumber);
        if (z6) {
            cLElementAllocate.setStart(i6);
        }
        if (cLElement instanceof CLContainer) {
            cLElementAllocate.setContainer((CLContainer) cLElement);
        }
        return cLElementAllocate;
    }

    private CLElement getNextJsonElement(int i6, char c7, CLElement cLElement, char[] cArr) throws CLParsingException {
        if (c7 != '\t' && c7 != '\n' && c7 != '\r' && c7 != ' ') {
            if (c7 == '\"' || c7 == '\'') {
                return cLElement instanceof CLObject ? createElement(cLElement, i6, TYPE.KEY, true, cArr) : createElement(cLElement, i6, TYPE.STRING, true, cArr);
            }
            if (c7 == '[') {
                return createElement(cLElement, i6, TYPE.ARRAY, true, cArr);
            }
            if (c7 != ']') {
                if (c7 == '{') {
                    return createElement(cLElement, i6, TYPE.OBJECT, true, cArr);
                }
                if (c7 != '}') {
                    switch (c7) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return createElement(cLElement, i6, TYPE.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            break;
                        case '/':
                            int i7 = i6 + 1;
                            if (i7 >= cArr.length || cArr[i7] != '/') {
                                return cLElement;
                            }
                            this.mHasComment = true;
                            return cLElement;
                        default:
                            if (!(cLElement instanceof CLContainer) || (cLElement instanceof CLObject)) {
                                return createElement(cLElement, i6, TYPE.KEY, true, cArr);
                            }
                            CLElement cLElementCreateElement = createElement(cLElement, i6, TYPE.TOKEN, true, cArr);
                            CLToken cLToken = (CLToken) cLElementCreateElement;
                            if (cLToken.validate(c7, i6)) {
                                return cLElementCreateElement;
                            }
                            throw new CLParsingException("incorrect token <" + c7 + "> at line " + this.mLineNumber, cLToken);
                    }
                }
            }
            cLElement.setEnd(i6 - 1);
            CLElement container = cLElement.getContainer();
            container.setEnd(i6);
            return container;
        }
        return cLElement;
    }

    public static CLObject parse(String str) {
        return new CLParser(str).parse();
    }

    public CLObject parse() throws CLParsingException {
        int i6;
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i7 = 1;
        this.mLineNumber = 1;
        boolean z6 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            }
            char c7 = charArray[i8];
            if (c7 == '{') {
                break;
            }
            if (c7 == '\n') {
                this.mLineNumber++;
            }
            i8++;
        }
        if (i8 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        CLObject cLObjectAllocate = CLObject.allocate(charArray);
        cLObjectAllocate.setLine(this.mLineNumber);
        cLObjectAllocate.setStart(i8);
        int i9 = i8 + 1;
        CLElement container = cLObjectAllocate;
        while (i9 < length) {
            char c8 = charArray[i9];
            if (c8 == '\n') {
                this.mLineNumber += i7;
            }
            if (this.mHasComment) {
                if (c8 == '\n') {
                    this.mHasComment = z6;
                } else {
                    i6 = i7;
                    i9++;
                    i7 = i6;
                    z6 = false;
                }
            }
            if (container == null) {
                break;
            }
            if (container.isDone()) {
                container = getNextJsonElement(i9, c8, container, charArray);
            } else if (container instanceof CLObject) {
                if (c8 == '}') {
                    container.setEnd(i9 - 1);
                } else {
                    container = getNextJsonElement(i9, c8, container, charArray);
                }
            } else if (!(container instanceof CLArray)) {
                boolean z7 = container instanceof CLString;
                if (z7) {
                    long j6 = container.mStart;
                    if (charArray[(int) j6] == c8) {
                        container.setStart(j6 + 1);
                        container.setEnd(i9 - 1);
                    }
                } else {
                    if (container instanceof CLToken) {
                        CLToken cLToken = (CLToken) container;
                        i6 = i7;
                        if (!cLToken.validate(c8, i9)) {
                            throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.mLineNumber, cLToken);
                        }
                    } else {
                        i6 = i7;
                    }
                    if ((container instanceof CLKey) || z7) {
                        long j7 = container.mStart;
                        char c9 = charArray[(int) j7];
                        if ((c9 == '\'' || c9 == '\"') && c9 == c8) {
                            container.setStart(j7 + 1);
                            container.setEnd(i9 - 1);
                        }
                    }
                    if (!container.isDone() && (c8 == '}' || c8 == ']' || c8 == ',' || c8 == ' ' || c8 == '\t' || c8 == '\r' || c8 == '\n' || c8 == ':')) {
                        long j8 = i9 - 1;
                        container.setEnd(j8);
                        if (c8 == '}' || c8 == ']') {
                            container = container.getContainer();
                            container.setEnd(j8);
                            if (container instanceof CLKey) {
                                container = container.getContainer();
                                container.setEnd(j8);
                            }
                        }
                    }
                    if (!container.isDone() && (!(container instanceof CLKey) || ((CLKey) container).mElements.size() > 0)) {
                        container = container.getContainer();
                    }
                    i9++;
                    i7 = i6;
                    z6 = false;
                }
            } else if (c8 == ']') {
                container.setEnd(i9 - 1);
            } else {
                container = getNextJsonElement(i9, c8, container, charArray);
            }
            i6 = i7;
            if (!container.isDone()) {
            }
            i9++;
            i7 = i6;
            z6 = false;
        }
        while (container != null && !container.isDone()) {
            if (container instanceof CLString) {
                container.setStart(((int) container.mStart) + 1);
            }
            container.setEnd(length - 1);
            container = container.getContainer();
        }
        if (sDebug) {
            System.out.println("Root: " + cLObjectAllocate.toJSON());
        }
        return cLObjectAllocate;
    }
}
