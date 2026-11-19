.class Lc0/d$c;
.super Lc0/d$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method constructor <init>(Lc0/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lc0/d$b;-><init>(Lc0/d;)V

    return-void
.end method


# virtual methods
.method public addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc0/d$a;->a:Lc0/d;

    .line 2
    invoke-static {p2}, Lc0/c;->H0(Landroid/view/accessibility/AccessibilityNodeInfo;)Lc0/c;

    move-result-object p2

    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lc0/d;->a(ILc0/c;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
