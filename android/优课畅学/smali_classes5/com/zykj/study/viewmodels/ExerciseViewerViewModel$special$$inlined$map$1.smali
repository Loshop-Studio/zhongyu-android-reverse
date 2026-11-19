# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/viewmodels/ExerciseViewerViewModel$special$$inlined$map$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;-><init>(Lcom/zykj/study/repository/ExerciseRepository;Landroidx/datastore/core/DataStore;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ll8/c;


# direct methods
.method public constructor <init>(Ll8/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseViewerViewModel$special$$inlined$map$1;->a:Ll8/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public collect(Ll8/d;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseViewerViewModel$special$$inlined$map$1;->a:Ll8/c;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/viewmodels/ExerciseViewerViewModel$special$$inlined$map$1$2;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lcom/zykj/study/viewmodels/ExerciseViewerViewModel$special$$inlined$map$1$2;-><init>(Ll8/d;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p2}, Ll8/c;->collect(Ll8/d;Lm7/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 20
    .line 21
    return-object p1
.end method
