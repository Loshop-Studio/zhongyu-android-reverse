.class public final synthetic Lv3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/AppUpdateDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/AppUpdateDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/a;->c:Lcom/friday/main/view/AppUpdateDialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv3/a;->c:Lcom/friday/main/view/AppUpdateDialog;

    invoke-static {v0, p1}, Lcom/friday/main/view/AppUpdateDialog;->t(Lcom/friday/main/view/AppUpdateDialog;Landroid/view/View;)V

    return-void
.end method
