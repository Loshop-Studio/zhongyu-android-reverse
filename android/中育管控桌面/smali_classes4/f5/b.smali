.class public interface abstract Lf5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf5/b$a;
    }
.end annotation


# static fields
.field public static final a:Lf5/b$a;

.field public static final b:Lf5/b;

.field public static final c:Lf5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lf5/b$a;->a:Lf5/b$a;

    .line 2
    .line 3
    sput-object v0, Lf5/b;->a:Lf5/b$a;

    .line 4
    .line 5
    new-instance v0, Lf5/b$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lf5/b$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lf5/b;->b:Lf5/b;

    .line 11
    .line 12
    new-instance v0, Lh5/a;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v1}, Lh5/a;-><init>(Lf5/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lf5/b;->c:Lf5/b;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public abstract a(Lf5/f0;Lf5/d0;)Lf5/b0;
.end method
