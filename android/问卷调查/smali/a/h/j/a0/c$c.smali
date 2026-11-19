.class public La/h/j/a0/c$c;
.super La/h/j/a0/c$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/h/j/a0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>(La/h/j/a0/c;)V
    .locals 0

    invoke-direct {p0, p1}, La/h/j/a0/c$b;-><init>(La/h/j/a0/c;)V

    return-void
.end method


# virtual methods
.method public addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, La/h/j/a0/c$a;->a:La/h/j/a0/c;

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
