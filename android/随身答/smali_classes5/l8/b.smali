.class public interface abstract Ll8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/b$a;
    }
.end annotation


# static fields
.field public static final a:Ll8/b$a;

.field public static final b:Ll8/b;

.field public static final c:Ll8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ll8/b$a;->a:Ll8/b$a;

    .line 2
    .line 3
    sput-object v0, Ll8/b;->a:Ll8/b$a;

    .line 4
    .line 5
    new-instance v0, Ll8/b$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Ll8/b$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ll8/b;->b:Ll8/b;

    .line 11
    .line 12
    new-instance v0, Ln8/a;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v1}, Ln8/a;-><init>(Ll8/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Ll8/b;->c:Ll8/b;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public abstract a(Ll8/a0;Ll8/y;)Ll8/w;
.end method
