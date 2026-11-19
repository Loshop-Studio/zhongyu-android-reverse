.class public final synthetic Lcom/zykj/evaluation/ui/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/http/bean/HeaderBean;

    invoke-static {p1}, Lcom/zykj/evaluation/ui/MainActivity$initData$2$1;->a(Lcom/zykj/http/bean/HeaderBean;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
