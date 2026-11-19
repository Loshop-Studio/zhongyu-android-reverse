.class public final synthetic Lp3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic c:Lcom/friday/login/view/LoginActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/login/view/LoginActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/e;->c:Lcom/friday/login/view/LoginActivity;

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/e;->c:Lcom/friday/login/view/LoginActivity;

    invoke-static {v0, p1, p2, p3}, Lcom/friday/login/view/LoginActivity;->O(Lcom/friday/login/view/LoginActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
