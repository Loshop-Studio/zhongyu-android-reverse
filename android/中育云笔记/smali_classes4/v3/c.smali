.class public final synthetic Lv3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/AppUpdateDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/AppUpdateDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/c;->c:Lcom/friday/main/view/AppUpdateDialog;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv3/c;->c:Lcom/friday/main/view/AppUpdateDialog;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/friday/main/view/AppUpdateDialog;->r(Lcom/friday/main/view/AppUpdateDialog;Ljava/util/List;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
