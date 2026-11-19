.class public final synthetic Lu4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/e;->a:Lcom/zykj/study/ui/MainActivity;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/e;->a:Lcom/zykj/study/ui/MainActivity;

    invoke-static {v0}, Lcom/zykj/study/ui/MainActivity;->r(Lcom/zykj/study/ui/MainActivity;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object v0

    return-object v0
.end method
