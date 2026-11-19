.class public interface abstract Lr2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr2/m$a;
    }
.end annotation


# static fields
.field public static final a:Lr2/m;

.field public static final b:Lr2/m$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr2/m$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lr2/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr2/m;->b:Lr2/m$a;

    .line 8
    .line 9
    new-instance v0, Lr2/m$a$a;

    .line 10
    .line 11
    invoke-direct {v0}, Lr2/m$a$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lr2/m;->a:Lr2/m;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public abstract a(Lr2/t;)Ljava/util/List;
.end method

.method public abstract b(Lr2/t;Ljava/util/List;)V
.end method
