.class public final synthetic Lr3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/app/App;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/app/App;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr3/a;->a:Lcom/zykj/huiwei/launcher/app/App;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lr3/a;->a:Lcom/zykj/huiwei/launcher/app/App;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/app/App;->a(Lcom/zykj/huiwei/launcher/app/App;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
