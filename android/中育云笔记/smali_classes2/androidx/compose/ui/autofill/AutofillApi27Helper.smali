.class public final Landroidx/compose/ui/autofill/AutofillApi27Helper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1b
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/ui/autofill/AutofillApi27Helper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/autofill/AutofillApi27Helper;

    invoke-direct {v0}, Landroidx/compose/ui/autofill/AutofillApi27Helper;-><init>()V

    sput-object v0, Landroidx/compose/ui/autofill/AutofillApi27Helper;->INSTANCE:Landroidx/compose/ui/autofill/AutofillApi27Helper;

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
.method public final notifyViewVisibilityChanged(Landroid/view/View;Landroid/view/autofill/AutofillManager;IZ)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1b
    .end annotation

    .line 1
    invoke-static {p2, p1, p3, p4}, Landroidx/compose/ui/autofill/w;->a(Landroid/view/autofill/AutofillManager;Landroid/view/View;IZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
