# 🔐 Log Monitoring System with Intrusion Alerts A lightweight and effective Java-based application that continuously monitors system log files for suspicious activity.

Designed to simulate intrusion detection functionality, this tool alerts users to potential attacks like failed login attempts and SQL injection patterns using real-time file monitoring and regex pattern matching. --- ##
📌 Features - 📄 **Real-Time Log Monitoring** Monitors a `system.log` file in real-time using Java's `RandomAccessFile`. 
- 🧠 **Regex-Based Intrusion Detection** Detects patterns such as: - Failed login attempts - SQL injection (e.g., `' OR 1=1 --`) - Dangerous SQL keywords like `DROP TABLE`, `UNION SELECT` - ⚠️ **Intrusion Alerts** - Console-based alerting - Optional Java Swing GUI to display alerts visually -
- ✉️ **Email Notification Support (Optional)** Extendable to include JavaMail API for email alerts. --- ## 🧪 Sample Log Entry Format
