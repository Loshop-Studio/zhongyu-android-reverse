.class final Landroidx/compose/ui/platform/AndroidComposeViewSensitiveContent35;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x23
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/platform/AndroidComposeViewSensitiveContent35;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/AndroidComposeViewSensitiveContent35;

    invoke-direct {v0}, Landroidx/compose/ui/platform/AndroidComposeViewSensitiveContent35;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/AndroidComposeViewSensitiveContent35;->INSTANCE:Landroidx/compose/ui/platform/AndroidComposeViewSensitiveContent35;

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
.method public final setContentSensitivity(Landroid/view/View;Z)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x23
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    invoke-static {p1, p2}, Landroidx/compose/ui/platform/l;->a(Landroid/view/View;I)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 p2, 0x0

    .line 9
    invoke-static {p1, p2}, Landroidx/compose/ui/platform/l;->a(Landroid/view/View;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
