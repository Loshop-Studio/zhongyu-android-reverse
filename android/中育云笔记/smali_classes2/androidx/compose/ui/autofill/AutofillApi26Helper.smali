.class public final Landroidx/compose/ui/autofill/AutofillApi26Helper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1a
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/ui/autofill/AutofillApi26Helper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/autofill/AutofillApi26Helper;

    invoke-direct {v0}, Landroidx/compose/ui/autofill/AutofillApi26Helper;-><init>()V

    sput-object v0, Landroidx/compose/ui/autofill/AutofillApi26Helper;->INSTANCE:Landroidx/compose/ui/autofill/AutofillApi26Helper;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final addChildCount(Landroid/view/ViewStructure;I)I
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->addChildCount(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final booleanValue(Landroid/view/autofill/AutofillValue;)Z
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/autofill/p;->a(Landroid/view/autofill/AutofillValue;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final getAutofillId(Landroid/view/ViewStructure;)Landroid/view/autofill/AutofillId;
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/autofill/j;->a(Landroid/view/ViewStructure;)Landroid/view/autofill/AutofillId;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getAutofillTextValue(Ljava/lang/String;)Landroid/view/autofill/AutofillValue;
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/autofill/u;->a(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final isDate(Landroid/view/autofill/AutofillValue;)Z
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/autofill/l;->a(Landroid/view/autofill/AutofillValue;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final isList(Landroid/view/autofill/AutofillValue;)Z
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/autofill/q;->a(Landroid/view/autofill/AutofillValue;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final isText(Landroid/view/autofill/AutofillValue;)Z
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/autofill/s;->a(Landroid/view/autofill/AutofillValue;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final isToggle(Landroid/view/autofill/AutofillValue;)Z
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/autofill/o;->a(Landroid/view/autofill/AutofillValue;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final listValue(Landroid/view/autofill/AutofillValue;)I
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/autofill/n;->a(Landroid/view/autofill/AutofillValue;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final newChild(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final setAutofillHints(Landroid/view/ViewStructure;[Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/autofill/m;->a(Landroid/view/ViewStructure;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setAutofillId(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1, p2, p3}, Landroidx/compose/ui/autofill/g;->a(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setAutofillType(Landroid/view/ViewStructure;I)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/autofill/v;->a(Landroid/view/ViewStructure;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setAutofillValue(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillValue;)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/autofill/k;->a(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillValue;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setCheckable(Landroid/view/ViewStructure;Z)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setCheckable(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setChecked(Landroid/view/ViewStructure;Z)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setChecked(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setChildCount(Landroid/view/ViewStructure;I)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setChildCount(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setClassName(Landroid/view/ViewStructure;Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setClickable(Landroid/view/ViewStructure;Z)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setClickable(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setContentDescription(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setDataIsSensitive(Landroid/view/ViewStructure;Z)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/autofill/i;->a(Landroid/view/ViewStructure;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setDimens(Landroid/view/ViewStructure;IIIIII)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual/range {p1 .. p7}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setEnabled(Landroid/view/ViewStructure;Z)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setFocusable(Landroid/view/ViewStructure;Z)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setFocusable(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setFocused(Landroid/view/ViewStructure;Z)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setFocused(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setId(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setInputType(Landroid/view/ViewStructure;I)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/autofill/r;->a(Landroid/view/ViewStructure;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setLongClickable(Landroid/view/ViewStructure;Z)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setLongClickable(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setOpaque(Landroid/view/ViewStructure;Z)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/autofill/t;->a(Landroid/view/ViewStructure;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setSelected(Landroid/view/ViewStructure;Z)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setSelected(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setText(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setVisibility(Landroid/view/ViewStructure;I)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final textValue(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/autofill/h;->a(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
