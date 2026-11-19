.class public final synthetic Ls6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lcom/zykj/student/dialogue/bean/resp/FilterType;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/zykj/student/dialogue/bean/resp/FilterType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/t;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ls6/t;->b:Lcom/zykj/student/dialogue/bean/resp/FilterType;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/t;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ls6/t;->b:Lcom/zykj/student/dialogue/bean/resp/FilterType;

    invoke-static {v0, v1}, Lcom/zykj/student/dialogue/ui/home/DrawerContentKt;->m(Lkotlin/jvm/functions/Function1;Lcom/zykj/student/dialogue/bean/resp/FilterType;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
