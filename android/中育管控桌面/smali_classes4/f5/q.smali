.class public interface abstract Lf5/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf5/q$a;
    }
.end annotation


# static fields
.field public static final a:Lf5/q$a;

.field public static final b:Lf5/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lf5/q$a;->a:Lf5/q$a;

    .line 2
    .line 3
    sput-object v0, Lf5/q;->a:Lf5/q$a;

    .line 4
    .line 5
    new-instance v0, Lf5/q$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lf5/q$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lf5/q;->b:Lf5/q;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
.end method
