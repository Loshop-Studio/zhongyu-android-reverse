# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/StudyViewModel;-><init>(Lcom/zykj/study/repository/CourseRepository;Landroidx/datastore/core/DataStore;Ll8/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ll8/c;

.field public final synthetic b:Lcom/zykj/study/data/CourseStudyEntity;


# direct methods
.method public constructor <init>(Ll8/c;Lcom/zykj/study/data/CourseStudyEntity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1;->a:Ll8/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1;->b:Lcom/zykj/study/data/CourseStudyEntity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public collect(Ll8/d;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1;->a:Ll8/c;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1$2;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1;->b:Lcom/zykj/study/data/CourseStudyEntity;

    .line 6
    .line 7
    invoke-direct {v1, p1, v2}, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1$2;-><init>(Ll8/d;Lcom/zykj/study/data/CourseStudyEntity;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1, p2}, Ll8/c;->collect(Ll8/d;Lm7/c;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-ne p1, p2, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 22
    .line 23
    return-object p1
.end method
