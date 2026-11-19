.class public interface abstract Ll/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll/a$c;
    }
.end annotation


# static fields
.field public static final a:Ll/a$c;

.field public static final b:Ll/a;

.field public static final c:Ll/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ll/a$c;->a:Ll/a$c;

    .line 2
    .line 3
    sput-object v0, Ll/a;->a:Ll/a$c;

    .line 4
    .line 5
    new-instance v0, Ll/a$b;

    .line 6
    .line 7
    invoke-direct {v0}, Ll/a$b;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ll/a;->b:Ll/a;

    .line 11
    .line 12
    new-instance v0, Ll/a$a;

    .line 13
    .line 14
    invoke-direct {v0}, Ll/a$a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ll/a;->c:Ll/a;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public abstract equals(Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract hashCode(Ljava/lang/Object;)I
.end method
