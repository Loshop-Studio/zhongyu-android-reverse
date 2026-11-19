.class public final synthetic Lcom/zykj/lib/ota/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/lib/ota/UpdateChoiceDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/lib/ota/UpdateChoiceDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/lib/ota/b;->a:Lcom/zykj/lib/ota/UpdateChoiceDialog;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/ota/b;->a:Lcom/zykj/lib/ota/UpdateChoiceDialog;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/zykj/lib/ota/UpdateChoiceDialog$initView$2;->d(Lcom/zykj/lib/ota/UpdateChoiceDialog;Ljava/lang/Boolean;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
