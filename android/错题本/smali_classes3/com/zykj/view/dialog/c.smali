.class public final synthetic Lcom/zykj/view/dialog/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:Landroid/view/Window;

.field public final synthetic b:Lcom/zykj/view/dialog/TextEditDialog;


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;Lcom/zykj/view/dialog/TextEditDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/dialog/c;->a:Landroid/view/Window;

    iput-object p2, p0, Lcom/zykj/view/dialog/c;->b:Lcom/zykj/view/dialog/TextEditDialog;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/dialog/c;->a:Landroid/view/Window;

    iget-object v1, p0, Lcom/zykj/view/dialog/c;->b:Lcom/zykj/view/dialog/TextEditDialog;

    invoke-static {v0, v1}, Lcom/zykj/view/dialog/TextEditDialog;->d(Landroid/view/Window;Lcom/zykj/view/dialog/TextEditDialog;)V

    return-void
.end method
