.class final Lcom/zykj/sketch/core/record/GraphOperation$addImage$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/record/GraphOperation$DefaultImpls;->addImage$default(Lcom/zykj/sketch/core/record/GraphOperation;Ljava/lang/String;IILhd/l;Lhd/l;ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/sketch/core/record/GraphOperation$addImage$3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/sketch/core/record/GraphOperation$addImage$3;

    invoke-direct {v0}, Lcom/zykj/sketch/core/record/GraphOperation$addImage$3;-><init>()V

    sput-object v0, Lcom/zykj/sketch/core/record/GraphOperation$addImage$3;->INSTANCE:Lcom/zykj/sketch/core/record/GraphOperation$addImage$3;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/sketch/core/graph/ImageGraph;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/record/GraphOperation$addImage$3;->invoke(Lcom/zykj/sketch/core/graph/ImageGraph;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/sketch/core/graph/ImageGraph;)V
    .locals 0

    .line 1
    return-void
.end method
