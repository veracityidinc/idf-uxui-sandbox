/**
 * @author bp
 */
const gulp = require('gulp'),
    sass = require('gulp-dart-sass'),
    autoprefixer = require('gulp-autoprefixer');

/* compile .scss to .css & copy resulting output in src/main/java/resources/style/.css*/
gulp.task('compile:sass', function() {
    return gulp.src('./src/main/webapp/style/*.scss')
        .pipe(sass({
            outputStyle: 'compressed'
        }).on('error', sass.logError))
        .pipe(autoprefixer({
            cascade: false,
            grid: 'autoplace'
        }))
        .pipe(gulp.dest('./target/idf-uxui-sandbox-1.0.0-SNAPSHOT/'))
});

/* default task */
gulp.task('default', gulp.series('compile:sass'));
