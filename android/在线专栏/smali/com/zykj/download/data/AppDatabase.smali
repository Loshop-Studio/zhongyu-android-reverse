.class public abstract Lcom/zykj/download/data/AppDatabase;
.super Landroidx/room/h0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/download/data/AppDatabase$a;
    }
.end annotation


# static fields
.field public static final n:Lcom/zykj/download/data/AppDatabase$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static volatile o:Lcom/zykj/download/data/AppDatabase;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/download/data/AppDatabase$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/download/data/AppDatabase$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/zykj/download/data/AppDatabase;->n:Lcom/zykj/download/data/AppDatabase$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/room/h0;-><init>()V

    return-void
.end method

.method public static final synthetic C()Lcom/zykj/download/data/AppDatabase;
    .locals 1

    sget-object v0, Lcom/zykj/download/data/AppDatabase;->o:Lcom/zykj/download/data/AppDatabase;

    return-object v0
.end method

.method public static final synthetic D(Lcom/zykj/download/data/AppDatabase;)V
    .locals 0

    sput-object p0, Lcom/zykj/download/data/AppDatabase;->o:Lcom/zykj/download/data/AppDatabase;

    return-void
.end method


# virtual methods
.method public abstract E()Lv1/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
