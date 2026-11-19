.class public final synthetic Ls6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/bean/resp/FilterType;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/bean/resp/FilterType;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/u;->a:Lcom/zykj/student/dialogue/bean/resp/FilterType;

    iput-boolean p2, p0, Ls6/u;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/u;->a:Lcom/zykj/student/dialogue/bean/resp/FilterType;

    iget-boolean v1, p0, Ls6/u;->b:Z

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/zykj/student/dialogue/ui/home/DrawerContentKt;->h(Lcom/zykj/student/dialogue/bean/resp/FilterType;ZLandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
