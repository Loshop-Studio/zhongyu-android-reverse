.class public final synthetic Lcom/zykj/student/dialogue/ui/home/o;
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
    check-cast p1, Ls6/k0;

    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$6;->a(Ls6/k0;)Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    move-result-object p1

    return-object p1
.end method
