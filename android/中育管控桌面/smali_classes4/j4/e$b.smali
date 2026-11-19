.class public final Lj4/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj4/e;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj4/e;


# direct methods
.method public constructor <init>(Lj4/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj4/e$b;->a:Lj4/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Dialog;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 4
    .line 5
    .line 6
    :cond_0
    iget-object p1, p0, Lj4/e$b;->a:Lj4/e;

    .line 7
    .line 8
    invoke-static {p1}, Lj4/e;->g(Lj4/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
