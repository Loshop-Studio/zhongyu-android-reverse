.class public final synthetic Ll4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/l;->a:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ll4/l;->a:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->b(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Ljava/lang/String;)Landroidx/lifecycle/LiveData;

    move-result-object p1

    return-object p1
.end method
