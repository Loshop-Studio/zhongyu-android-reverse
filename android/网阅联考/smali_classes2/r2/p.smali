.class public interface abstract Lr2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr2/p$a;
    }
.end annotation


# static fields
.field public static final a:Lr2/p;

.field public static final b:Lr2/p$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr2/p$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lr2/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr2/p;->b:Lr2/p$a;

    .line 8
    .line 9
    new-instance v0, Lr2/p$a$a;

    .line 10
    .line 11
    invoke-direct {v0}, Lr2/p$a$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lr2/p;->a:Lr2/p;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
.end method
