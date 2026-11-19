package androidx.constraintlayout.core.parser;

import androidx.constraintlayout.widget.ConstraintLayout;

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

    private CLElement createElement(CLElement cLElement, int i9, TYPE type, boolean z9, char[] cArr) {
        CLElement cLElementAllocate;
        if (sDebug) {
            System.out.println("CREATE " + type + " at " + cArr[i9]);
        }
        switch (type.ordinal()) {
            case 1:
                cLElementAllocate = CLObject.allocate(cArr);
                i9++;
                break;
            case 2:
                cLElementAllocate = CLArray.allocate(cArr);
                i9++;
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
        if (z9) {
            cLElementAllocate.setStart(i9);
        }
        if (cLElement instanceof CLContainer) {
            cLElementAllocate.setContainer((CLContainer) cLElement);
        }
        return cLElementAllocate;
    }

    private CLElement getNextJsonElement(int i9, char c10, CLElement cLElement, char[] cArr) throws CLParsingException {
        if (c10 != '\t' && c10 != '\n' && c10 != '\r' && c10 != ' ') {
            if (c10 == '\"' || c10 == '\'') {
                return cLElement instanceof CLObject ? createElement(cLElement, i9, TYPE.KEY, true, cArr) : createElement(cLElement, i9, TYPE.STRING, true, cArr);
            }
            if (c10 == '[') {
                return createElement(cLElement, i9, TYPE.ARRAY, true, cArr);
            }
            if (c10 != ']') {
                if (c10 == '{') {
                    return createElement(cLElement, i9, TYPE.OBJECT, true, cArr);
                }
                if (c10 != '}') {
                    switch (c10) {
                        case '+':
                        case '-':
                        case '.':
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        case '2':
                        case '3':
                        case '4':
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                        case '8':
                        case '9':
                            return createElement(cLElement, i9, TYPE.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            break;
                        case '/':
                            int i10 = i9 + 1;
                            if (i10 >= cArr.length || cArr[i10] != '/') {
                                return cLElement;
                            }
                            this.mHasComment = true;
                            return cLElement;
                        default:
                            if (!(cLElement instanceof CLContainer) || (cLElement instanceof CLObject)) {
                                return createElement(cLElement, i9, TYPE.KEY, true, cArr);
                            }
                            CLElement cLElementCreateElement = createElement(cLElement, i9, TYPE.TOKEN, true, cArr);
                            CLToken cLToken = (CLToken) cLElementCreateElement;
                            if (cLToken.validate(c10, i9)) {
                                return cLElementCreateElement;
                            }
                            throw new CLParsingException("incorrect token <" + c10 + "> at line " + this.mLineNumber, cLToken);
                    }
                }
            }
            cLElement.setEnd(i9 - 1);
            CLElement container = cLElement.getContainer();
            container.setEnd(i9);
            return container;
        }
        return cLElement;
    }

    public static CLObject parse(String str) throws CLParsingException {
        return new CLParser(str).parse();
    }

    public CLObject parse() throws CLParsingException {
        int i9;
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i10 = 1;
        this.mLineNumber = 1;
        boolean z9 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            char c10 = charArray[i11];
            if (c10 == '{') {
                break;
            }
            if (c10 == '\n') {
                this.mLineNumber++;
            }
            i11++;
        }
        if (i11 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        CLObject cLObjectAllocate = CLObject.allocate(charArray);
        cLObjectAllocate.setLine(this.mLineNumber);
        cLObjectAllocate.setStart(i11);
        int i12 = i11 + 1;
        CLElement container = cLObjectAllocate;
        while (i12 < length) {
            char c11 = charArray[i12];
            if (c11 == '\n') {
                this.mLineNumber += i10;
            }
            if (this.mHasComment) {
                if (c11 == '\n') {
                    this.mHasComment = z9;
                } else {
                    i9 = i10;
                    i12++;
                    i10 = i9;
                    z9 = false;
                }
            }
            if (container == null) {
                break;
            }
            if (container.isDone()) {
                container = getNextJsonElement(i12, c11, container, charArray);
            } else if (container instanceof CLObject) {
                if (c11 == '}') {
                    container.setEnd(i12 - 1);
                } else {
                    container = getNextJsonElement(i12, c11, container, charArray);
                }
            } else if (!(container instanceof CLArray)) {
                boolean z10 = container instanceof CLString;
                if (z10) {
                    long j9 = container.mStart;
                    if (charArray[(int) j9] == c11) {
                        container.setStart(j9 + 1);
                        container.setEnd(i12 - 1);
                    }
                } else {
                    if (container instanceof CLToken) {
                        CLToken cLToken = (CLToken) container;
                        i9 = i10;
                        if (!cLToken.validate(c11, i12)) {
                            throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.mLineNumber, cLToken);
                        }
                    } else {
                        i9 = i10;
                    }
                    if ((container instanceof CLKey) || z10) {
                        long j10 = container.mStart;
                        char c12 = charArray[(int) j10];
                        if ((c12 == '\'' || c12 == '\"') && c12 == c11) {
                            container.setStart(j10 + 1);
                            container.setEnd(i12 - 1);
                        }
                    }
                    if (!container.isDone() && (c11 == '}' || c11 == ']' || c11 == ',' || c11 == ' ' || c11 == '\t' || c11 == '\r' || c11 == '\n' || c11 == ':')) {
                        long j11 = i12 - 1;
                        container.setEnd(j11);
                        if (c11 == '}' || c11 == ']') {
                            container = container.getContainer();
                            container.setEnd(j11);
                            if (container instanceof CLKey) {
                                container = container.getContainer();
                                container.setEnd(j11);
                            }
                        }
                    }
                    if (!container.isDone() && (!(container instanceof CLKey) || ((CLKey) container).mElements.size() > 0)) {
                        container = container.getContainer();
                    }
                    i12++;
                    i10 = i9;
                    z9 = false;
                }
            } else if (c11 == ']') {
                container.setEnd(i12 - 1);
            } else {
                container = getNextJsonElement(i12, c11, container, charArray);
            }
            i9 = i10;
            if (!container.isDone()) {
            }
            i12++;
            i10 = i9;
            z9 = false;
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
